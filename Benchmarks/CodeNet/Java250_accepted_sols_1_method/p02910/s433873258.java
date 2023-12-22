import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        boolean ease = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                if (c == 'L') ease = false;
            } else {
                if (c == 'R') ease = false;
            }
        }

        if (ease) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
