import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(calc(N,a));
    }

    public static int calc(int N, int[] a) {
        int allice = 0;
        int bob = 0;
        Arrays.sort(a);
        for (int i=N-1; i>=0; i-=2) {
            allice += a[i];
            if (i>=1) bob += a[i-1];
        }
        return allice - bob;
    }
}
