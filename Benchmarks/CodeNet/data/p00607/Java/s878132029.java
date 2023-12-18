import java.util.*;

class Emacs {
    
    String buffer;
    int cursorX;
    int cursorY;
    ArrayList<String> body;

    Emacs(ArrayList<String> body) {
        this.buffer = "";
        this.cursorX = 1;
        this.cursorY = 1;
        this.body = body;
    }

    void acceptCommand(char c) {
        switch (c) {
            case 'a':
                this.moveCursorMostLeft();
                break;
            case 'e':
                this.moveCursorMostRight();
                break;
            case 'p':
                this.moveCursorUp();
                this.moveCursorMostLeft();
                break;
            case 'n':
                this.moveCursorDown();
                this.moveCursorMostLeft();
                break;
            case 'f':
                this.moveCursorForward();
                break;
            case 'b':
                this.moveCursorBackward();
                break;
            case 'd':
                this.deleteChar();
                break;
            case 'k':
                this.killChar();
                break;
            case 'y':
                this.yankBuffer();
                break;
        }
    }

    void yankBuffer() {
        String cl = this.getCurrentLine();
        if (this.buffer.equals("")) {
            return;
        } else if (this.buffer.equals("!")) {
            this.body.add(this.body.get(this.body.size() - 1));
            for(int i = this.body.size() - 1; i >= this.cursorY + 1; i--) {
                this.body.set(i, this.body.get(i - 1));
            }
            this.body.set(this.cursorY, cl.substring(this.cursorX - 1, cl.length()));
            this.body.set(this.cursorY - 1, cl.substring(0, this.cursorX - 1));
            this.cursorY += 1;
            this.moveCursorMostLeft();
        } else {
            this.body.set(this.cursorY - 1, cl.substring(0, this.cursorX - 1) + this.buffer + cl.substring(this.cursorX - 1, cl.length()));
            this.cursorX += this.buffer.length();
        }
    }

    void deleteChar() {

        String cl = this.getCurrentLine();

        if (this.cursorX <= cl.length()) {
            String tmp1 = cl.substring(0, this.cursorX - 1);
            String tmp2 = cl.substring(this.cursorX,  cl.length());
            this.body.set(this.cursorY - 1, tmp1 + tmp2);
        } else if (this.cursorY < body.size()) {
            this.body.set(this.cursorY - 1, cl + this.body.get(this.cursorY));
            for(int i = this.cursorY; i < this.body.size() - 1; i++) {
                this.body.set(i, this.body.get(i+1));
            }
            this.body.remove(this.body.size() - 1);
        }
    }

    void killChar() {
        String cl = this.getCurrentLine();

        if (this.cursorX <= cl.length()) {
            this.buffer = cl.substring(this.cursorX - 1, cl.length());
            this.body.set(this.cursorY - 1, cl.substring(0, this.cursorX - 1));
        } else {
            this.buffer = "!";
            this.deleteChar();
        }
    }

    void moveCursorForward() {
        if (this.cursorX <= this.getCurrentLine().length()) {
            this.cursorX += 1;
        } else if (this.cursorY < body.size()) {
            this.cursorY += 1;
            this.moveCursorMostLeft();
        }
    }

    void moveCursorBackward() {
        if (this.cursorX > 1) {
            this.cursorX -= 1;
        } else if (this.cursorY > 1) {
            this.cursorY -= 1;
            this.moveCursorMostRight();
        }
    }

    void moveCursorMostLeft() {
        this.cursorX = 1;
    }

    void moveCursorMostRight() {
        this.cursorX = body.get(cursorY - 1).length() + 1;
    }

    void moveCursorUp() {
        if(this.cursorY > 1)    this.cursorY -= 1;
    }

    void moveCursorDown() {
        if(this.cursorY < body.size())  this.cursorY += 1;
    }

    void printBody() {
        // System.out.printf("Cursor: (%d, %d)\n", this.cursorX, this.cursorY);
        // System.out.printf("Buffer: %s\n",   this.buffer);
        for (String line : this.body) {
            System.out.println(line);
        }
    }

    String getCurrentLine() {
        return this.body.get(this.cursorY - 1);
    }

}

class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<String>();

        while (true) {
            String line = sc.nextLine();
            if (line.equals("END_OF_TEXT")) break;
            lines.add(line);
        }

        Emacs emacs = new Emacs(lines);

        while (true) {
            char c = sc.nextLine().charAt(0);
            if(c == '-')    break;
            emacs.acceptCommand(c); 
        }

        emacs.printBody();
    }
}