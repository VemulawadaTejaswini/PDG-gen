import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
            if(a[i] == 0) {
                System.out.println(0);
                return;
            }
        }
        long res = 1;
        for(int i=0; i<n; i++) {
            if(1000000000000000000L / res < a[i]) {
                System.out.println("-1");
                return;
            }
            res *= a[i];
            if(res > 1000000000000000000L) {
                System.out.println("-1");
                return;
            }
        }
        System.out.println(res);

    }

}