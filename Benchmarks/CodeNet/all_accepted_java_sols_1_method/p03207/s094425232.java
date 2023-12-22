
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += p[i];
            max = Math.max(p[i], max);
        }
        sum -= max / 2;
        System.out.println(sum);
    }

}
