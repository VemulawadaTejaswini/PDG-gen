import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 1 ; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 1 ; i < n ; i++) {
            b[a[i] - 1]++;
        }
        for (int i = 0 ; i < n ; i++) {
            System.out.println(b[i]);
        }
    }

}