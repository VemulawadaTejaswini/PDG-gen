
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        for (int i = 0 ; i < 5 ; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i] % 10;
        }
        int min = 123345;
        for (int i = 0 ; i < 5 ; i++) {
            int sum = 0;
            for (int j = 0 ; j < 5 ; j++) {
                if (i == j) {
                    sum += a[j];
                } else {
                    int d = (a[j] + 9) / 10;
                    sum += d * 10;
                }
            }
            min = Math.min(min, sum);
        }

        System.out.println(min);
    }

}