import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            String S = in.next();

            StringBuilder res = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                int n = S.charAt(i) - 'A';
                char c = (char) ('A' + (n + N) % 26);
                res.append(c);
            }

            System.out.println(res.toString());
        }
    }
}
