import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a[] = new long[(int)n];
        for (long l = 1; l < n; l++) {
            a[sc.nextInt() - 1] += 1;
        }
        sc.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
