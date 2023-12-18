import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        StringJoiner ans = new StringJoiner(" ");
        int i = n - 1;
        while (i >= 0) {
            ans.add(String.valueOf(a[i]));
            i -= 2;
        }
        i = (n % 2 == 0) ? 0 : 1;
        while (i < n) {
            ans.add(String.valueOf(a[i]));
            i += 2;
        }
        System.out.println(ans.toString());
    }

}
