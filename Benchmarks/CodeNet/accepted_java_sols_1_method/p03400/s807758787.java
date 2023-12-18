import java.math.BigInteger;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                if (j * a[i] + 1 <= d) {
                    sum++;
                } else {
                    break;
                }
            }
        }
        System.out.println(sum + x);
    }

}