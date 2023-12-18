import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum += 2 * Math.min(x[i], k - x[i]);
        }
        System.out.println(sum);
    }

}
