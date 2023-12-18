
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int r = 0;
            int a = h[0];
            if (a - i >= 0) {
                r = 1;
            } else {
                r = -1;
            }
            int cc = 0;
            for (int j = 0; j < n; j++) {
                if (a - i >= 0) {
                    if (r == 1 && h[j] - i < 0) {
                        r = -1;
                        cc++;
                    }
                    if (r == -1 && h[j] - i >= 0) {
                        r = 1;
                        cc++;
                    }
                } else {
                    if (r == 1 && h[j] - i < 0) {
                        r = -1;
                        cc++;
                    }
                    if (r == -1 && h[j] - i >= 0) {
                        r = 1;
                        cc++;
                    }
                }

            }
            if (a - i >= 0) {
                count += cc  / 2  + 1;
            } else {
                count += (cc + 1)  / 2 ;
            }
        }
        System.out.println(count);

    }

}