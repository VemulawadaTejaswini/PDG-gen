import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer N = Integer.parseInt(sc.nextLine());
        String[] VN = sc.nextLine().split(" ");

        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = Integer.parseInt(VN[i]);
        }

        Arrays.sort(values);

        // 貪欲法で解いていく
        double ans = mix(values, N);
        System.out.println(ans);
    }

    private static double mix(int[] values, int N) {

        double tmp = values[0];
        for (int i = 1; i < N; i++) {
            double v = values[i];

            tmp = (tmp + v) / 2;
        }
        return tmp;
    }
}
