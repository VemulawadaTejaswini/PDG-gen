import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Az = new int[N];
        int[] sortedAz = new int[N];
        for (int i = 0; i < N; i++) {
            Az[i] = sc.nextInt();
        }
        Arrays.sort(Az);
        for (int i = N - 1; i >= 0; i--) {
            sortedAz[N - i - 1] = Az[i];
//            System.out.println(sortedAz[N - i - 1]);
        }
        long sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += sortedAz[(i + 1) / 2];
        }
        System.out.println(sum);

    }
}
