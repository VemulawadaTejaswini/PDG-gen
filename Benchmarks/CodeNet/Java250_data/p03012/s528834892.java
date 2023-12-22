import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] W = new int[N];
        for (int i = 0; i < N; i++) {
            W[i] = Integer.parseInt(sc.next());
        }

        int left = 0;
        int right = 0;
        int dif = 100000;
        for (int i = 0; i < N; i++) {
            left = sum(Arrays.copyOfRange(W, 0, i));
            right = sum(Arrays.copyOfRange(W, i, W.length));
            dif = Math.min(dif, Math.abs(left - right));
        }
        System.out.println(dif);
    }

    private static int sum(int[] temp) {
        int n = temp.length;
        int ret = 0;
        for (int i = 0; i < n; i++) {
            ret += temp[i];
        }
        return ret;
    }
}
