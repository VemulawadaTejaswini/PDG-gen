
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        Arrays.sort(p);
        int ans = 0;
        for (int i = 0;i<k;i++) {
            ans += p[i];
        }

        System.out.println(ans);
    }

}
