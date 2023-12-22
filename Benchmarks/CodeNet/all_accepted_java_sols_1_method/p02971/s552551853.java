import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }

        int[] b = new int[n];
        for (int i = 0 ; i < n ; i++) {
            b[i] = a[i];
        }

        Arrays.sort(b);

        int maxNum = b[b.length - 1];
        int secondNum = b[b.length - 2];
        for (int i = 0 ; i < n ; i++) {
            if (a[i] == maxNum) {
                System.out.println(secondNum);
            } else {
                System.out.println(maxNum);
            }
        }

    }

}
