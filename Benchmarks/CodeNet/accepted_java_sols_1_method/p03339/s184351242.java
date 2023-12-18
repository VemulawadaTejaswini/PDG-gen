import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        char[] S = sc.nextLine().toCharArray();
        int[] WE = new int[N];
        int[] EW = new int[N];
        int tmp = 0;
        for (int i = 1; i < N; i++) {
            if (S[i - 1] == 'W') {
                tmp++;
            }
            WE[i] = tmp;
        }
        tmp = 0;
        for (int i = N - 1; i > 0; i--) {
            if (S[i] == 'E') {
                tmp++;
            }
            EW[i - 1] = tmp;
        }

        int ans = WE[0] + EW[0];
        for (int i = 1; i < N; i++) {
            int sum = WE[i] + EW[i];
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
}

