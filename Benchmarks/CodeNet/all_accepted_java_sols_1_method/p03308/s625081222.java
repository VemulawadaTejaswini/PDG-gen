
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < n; i++) {
            min = Math.min(a[i], min);
            max = Math.max(a[i], max);
        }
        System.out.println(max - min);
    }

}
