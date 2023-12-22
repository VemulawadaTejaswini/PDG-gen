import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);

        long sum = 0;
        for(int i=0; i<a.length; i++) {
            sum += a[i];
        }

        System.out.println(a[0] + " " + a[a.length-1] + " " + sum);
    }
}

