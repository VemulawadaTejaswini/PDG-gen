import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            int count = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '1') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
