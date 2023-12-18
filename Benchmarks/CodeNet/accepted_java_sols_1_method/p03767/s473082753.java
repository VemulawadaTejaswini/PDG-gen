import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n*3];
        for (int i = 0; i < n * 3; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[n+i*2];
        }
        System.out.println(sum);
    }
}
