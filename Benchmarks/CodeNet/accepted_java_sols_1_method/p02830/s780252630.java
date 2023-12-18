import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            String S = in.next();
            String T = in.next();

            StringBuilder res = new StringBuilder();
            for (int i = 0; i < N; i++) {
                res.append(S.charAt(i));
                res.append(T.charAt(i));
            }

            System.out.println(res.toString());
        }
    }
}