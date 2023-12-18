import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long mod= (long) (10e9+7);
        long n = sc.nextLong();
        Long[] a = new Long[(int) n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long sum = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++)
                {
                    sum+=(a[i]*a[j]);

                }
        }
        System.out.println(sum);
    }
}

