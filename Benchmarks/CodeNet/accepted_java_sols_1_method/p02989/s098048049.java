import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d[] = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        int min = d[n / 2 - 1];
        int max = d[n / 2];
        int ans = max - min;
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
