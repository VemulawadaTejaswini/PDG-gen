import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        
        int alice = 0;
        int bob = 0;
        int cnt = n-1;
        while (cnt >= 0) {
            alice += a[cnt--];
            if (cnt >= 0)
                bob += a[cnt--];
        }
        
        System.out.println(alice - bob);
    }
}
