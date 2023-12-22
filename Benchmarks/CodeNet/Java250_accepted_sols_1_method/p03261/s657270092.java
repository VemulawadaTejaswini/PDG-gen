import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] W = new String[N];
        String tmp;
        for (int i = 0; i < N; i++) {
            tmp = sc.next();
            //ダブっている単語があるかをチェック
            if (Arrays.asList(W).contains(tmp)) {
                System.out.println("No");
                return;
            }
            W[i] = tmp;
        }

        for (int i = 0; i < N - 1; i++) {
            if (W[i].charAt(W[i].length() - 1) != W[i + 1].charAt(0)) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");


    }
}
