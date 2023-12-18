import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int N = 5;
        Scanner sc = new Scanner(System.in);
        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            times[i] = sc.nextInt();
        }

        int minIndex = 0;
        int min = times[0]%10;
        for (int i = 1; i < N; i++) {
            if ((times[i]%10 != 0) && (times[i]%10 < min)) {
                minIndex = i;
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i == minIndex) {
                ans += times[i];
            }
            else if (times[i]%10 == 0) {
                ans += times[i];
            }
            else {
                ans += (times[i] + (10 - times[i]%10));
            }
        }
        System.out.println(ans);
    }
}
