import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0 ; i < n ; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        long sum = 0;
        for (int i = 0 ; i < n - k ; i++) {
            sum += (long) h[i];
        }
        System.out.println(sum);

    }

}
