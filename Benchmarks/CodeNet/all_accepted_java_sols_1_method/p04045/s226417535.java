import java.util.Scanner;

/**
 * ABC042C
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        boolean[] dislike = new boolean[10];
        for (int i = 0; i < dislike.length; i++) {
            dislike[i] = false;
        }

        for (int i = 0; i < K; i++) {
            dislike[sc.nextInt()] = true;
        }

        int i = N;
        int ans = 0;
        while (true) {
            boolean canPay = false;
            for (int j = 0; j < Integer.toString(i).length(); j++) {
                if (dislike[Integer.toString(i).charAt(j) - '0']) {
                    canPay = false;
                    break;
                }

                canPay = true;
            }

            if (canPay) {
                ans = i;
                break;
            }

            i++;
        }

        System.out.println(ans);
    }
}