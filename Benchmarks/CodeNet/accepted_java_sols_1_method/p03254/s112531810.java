import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int x = cin.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = cin.nextInt();
        }

        Arrays.sort(a);

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (x >= a[i]) {
                x -= a[i];
                cnt++;
            } else {
                break;
            }
        }

        if (cnt == N && x > 0) {
            cnt--;
        }

        System.out.println(cnt);
    }
}
