import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int t = 0;
        for (int i = 0; i < n - 1; ++i) {
            t += a[i];
        }

        System.out.println(t > a[n-1] ? "Yes" : "No");
    }
}