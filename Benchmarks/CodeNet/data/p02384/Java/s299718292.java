import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] n = br.readLine().split(" ");
        
        Dice dice = new Dice(n[0], n[1], n[2], n[3], n[4], n[5]);
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++) {
            String [] line = br.readLine().split(" ");
            System.out.println(dice.askRight(line[0], line[1]));
        }
    }
}

class Dice {
    private String top;
    private String front;
    private String right;
    private String left;
    private String back;
    private String bottom;
    
    public Dice(String top, String front, String right, String left, String back, String bottom) {
        this.top = top;
        this.front = front;
        this.right = right;
        this.left = left;
        this.back = back;
        this.bottom = bottom;
    }
    
    public String askRight(String top, String front) {
        setTop(top);
        setFront(front);
        return this.right;
    }
    
    private void setTop(String top) {
        for(int i = 0; i < 4; i++) {
            if(this.top.equals(top)) {
                return;
            }
            goNorth();
        }
        
        goEast();

        for(int i = 0; i < 4; i++) {
            if(this.top.equals(top)) {
                return;
            }
            goNorth();
        }
    }
    
    private void setFront(String front) {
        for(int i = 0; i < 4; i++) {
            if(this.front.equals(front)) {
                return;
            }
            leftRotation();
        }
    }
    
    private void leftRotation() {
        String tmp = this.front;
        this.front = this.right;
        this.right = this.back;
        this.back = this.left;
        this.left = tmp;
    }

    public String nowTopNum() {
        return this.top;
    }
    
    public void goSouth() {
        String tmp = this.front;
        this.front = this.top;
        this.top = this.back;
        this.back = this.bottom;
        this.bottom = tmp;
    }

    public void goNorth() {
        String tmp = this.front;
        this.front = this.bottom;
        this.bottom = this.back;
        this.back = this.top;
        this.top = tmp;
    }

    public void goEast() {
        String tmp = this.top;
        this.top = this.left;
        this.left = this.bottom;
        this.bottom = this.right;
        this.right = tmp;
    }

    public void goWest() {
        String tmp = this.top;
        this.top = this.right;
        this.right = this.bottom;
        this.bottom = this.left;
        this.left = tmp;
    }
}

