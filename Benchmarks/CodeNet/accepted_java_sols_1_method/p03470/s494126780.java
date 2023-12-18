import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d[] = new int[N];
        int tmp = 0, ans = 0;

        for (int i = 0; N > i; i++) {
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        for(int j = N - 1; 0 <= j; j--) {
            if (tmp != d[j]) {
                tmp = d[j];
                ans++;
            }
        }
        System.out.println(ans);
    }
}