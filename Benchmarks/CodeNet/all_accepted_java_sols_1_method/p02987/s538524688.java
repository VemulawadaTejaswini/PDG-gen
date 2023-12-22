import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] S = sc.next().toCharArray();

        for (int i = 0; i < S.length; i++) {
            char c = S[i];

            boolean isYes = false;
            for (int j = 0; j < S.length; j++) {
                if (i == j) continue;

                if (c == S[j]) {
                    isYes = true;
                    break;
                }
            }

            if (!isYes) {
                System.out.println("No");
                return;
            }
        }

        if (S[0] == S[1] && S[0] == S[2] && S[0] == S[3]) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
}
