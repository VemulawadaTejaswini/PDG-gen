import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String S0 = scan.next();

        int[] S = new int[S0.length()];

        for (int i = 0; i < S0.length(); i++) {
            S[i] = S0.charAt(i) - '0';
        }

        int ans = 0;
        for (int x = 0; x < 1000; x++) {
            int x0 = (x / 100) % 10;
            int x1 = (x / 10) % 10;
            int x2 = x % 10;
            //System.out.println("" + x0 + x1 + x2);

            for (int i = 0; i < N; i++) {
                if (S[i] == x0) {
                    for (int j = i+1; j < N; j++) {
                        if (S[j] == x1) {
                            for (int k = j+1; k < N; k++) {
                                if (S[k] == x2) {
                                   ans++;
                                   break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }

        }
        System.out.println(ans);

    }

}
