import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) evenCount++;
        }
        long tmp = 1;
        if (evenCount != 0) {
            tmp = (long) Math.pow(2, evenCount);
        }
        long ans = (long) (Math.pow(3, n) - tmp);
        System.out.println(ans);
    }
}
