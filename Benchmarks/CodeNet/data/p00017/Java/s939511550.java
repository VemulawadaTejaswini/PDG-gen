import java.util.*;

class Main {

    static char ShiftChar(char c, int s) {
        char res = (char)(c + s);
        if (res > 'z')  res -= 26;
        return res;
    }

    static StringBuilder ShiftString(StringBuilder str, int s) {
        StringBuilder res = new StringBuilder(str.toString());
        for (int i = 0; i < str.length(); i++) {
            char c = res.charAt(i);
            if ('a' <= c && c <= 'z') {
                res.setCharAt(i, ShiftChar(c, s));
            }
        }
        return res;
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder line;

        while (true) {
            try {
                line = new StringBuilder(sc.nextLine());
            } catch (NoSuchElementException e) {
                break;
            }
                
            int shift = -1;
            boolean solved = false;
                    
            while (!solved) {
                shift += 1;
                 
                String[] words = ShiftString(line, shift).toString().split(" ");    
                for(int i = 0; i < words.length - 1; i++) {
                    if (words[i].equals("the") || words[i].equals("this") || words[i].equals("that")) {
                        solved = true;         
                    }
                }

            }

            System.out.println(ShiftString(line, shift));
        }

    }
}