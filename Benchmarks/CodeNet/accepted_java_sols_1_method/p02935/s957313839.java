import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v[] = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }

        Arrays.sort(v);
        double ans = v[0];
        for (int i = 1; i < n; i++) {
            ans = (ans + v[i]) / 2;
        }
        System.out.println(ans);
    }
}