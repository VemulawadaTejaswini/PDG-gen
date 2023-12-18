import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        for (int i = 0; i <= n; i++) {
            int c = 0;
            int m = i;
            while (m > 0) {
                c += m % 6;
                m /= 6;
            }
            m = n - i;
            while (m > 0) {
                c += m % 9;
                m /= 9;
            }
            if (c < count) {
                count = c;
            }
        }
        System.out.println(count);
    }
}