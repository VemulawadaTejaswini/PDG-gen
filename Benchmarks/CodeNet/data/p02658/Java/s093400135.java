import java.util.*;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0) {
                System.out.println(0);
                System.exit(0);
            }
        }
        long ans = 1;
        long d = 1000000000000000001L;
        for (int i = 0; i < n; i++) {
            ans = ans * a[i];
            if(ans >= d) {
                System.out.println(-1);
                System.exit(0);
            }
        }
        System.out.println(ans);
   }
}