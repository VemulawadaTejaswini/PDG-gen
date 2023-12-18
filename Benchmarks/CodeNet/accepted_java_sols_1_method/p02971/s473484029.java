import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mx = -1;
        int mx2 = -1;
        int mxid = -1;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a >= mx) {
                mx2 = mx;
                mx = a;
                mxid = i;
            } else if (a >= mx2) {
                mx2 = a;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == mxid) {
                System.out.println(mx2);
            } else {
                System.out.println(mx);
            }
        }
    }
}