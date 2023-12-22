
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        if (sum >= h) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
