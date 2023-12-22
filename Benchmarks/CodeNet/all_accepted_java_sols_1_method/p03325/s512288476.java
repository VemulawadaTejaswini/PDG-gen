import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            while (a[i] % 2 == 0) {
                sum++;
                a[i] /= 2;
            }
        }
        System.out.println(sum);
    }

}
