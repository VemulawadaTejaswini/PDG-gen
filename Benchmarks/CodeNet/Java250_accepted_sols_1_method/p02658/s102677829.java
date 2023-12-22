import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long r = 1;
        long[] a = new long[n];
        boolean flag =false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if(a[i] == 0)  flag = true;
        }
        if (flag) {
            r = 0;
        } else {
            long t = a[0];
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    r = t * a[i];
                    if (r > 1000000000000000000L || r < t) {
                        r = -1;
                        break;
                    }
                    t = r;
                }
            }
        }

        System.out.println(r);
    }
}