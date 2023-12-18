import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            int number = 0;
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c == '+') {
                    number++;
                } else {
                    number--;
                }
            }
            System.out.println(number);
        }
    }
}
