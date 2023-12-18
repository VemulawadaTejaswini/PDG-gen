import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();

        String exc = S.substring(K-1, K);
        String ansS = "";

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) != exc.charAt(0)) {
                ansS += "*";
            }
            else {
                ansS += S.substring(i, i + 1);
            }
        }

        System.out.println(ansS);
    }
}