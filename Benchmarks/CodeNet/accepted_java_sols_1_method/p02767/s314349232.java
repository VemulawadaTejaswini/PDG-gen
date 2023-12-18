import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] x = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            x[i] = temp;
            sum += temp;
        }
        int ans = 0;
        int ans2 = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.pow(x[i] - (int)Math.ceil(sum * 1.0 / n), 2);
            ans2 += Math.pow(x[i] - (int)Math.floor(sum * 1.0 / n), 2);
        }
        System.out.println(Math.min(ans, ans2));
    }
}