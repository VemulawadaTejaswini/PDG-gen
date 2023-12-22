import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);
        long ans = a[0] + a[1];
        for(int i = 2; i < n; i++) {
            ans += a[i] * Math.pow(2, i - 1);
        }

        System.out.println((double)(ans / Math.pow(2, n - 1)));
    }

}
