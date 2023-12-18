import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(x);
            return;
        }
        int[] arr = new int[102];
        for (int i=0; i<n; i++) {
            int p = sc.nextInt();
            arr[p] = 1;
        }
        int min = 999, index = 0;
        for (int i=0; i<=101; i++) {
            if (arr[i] == 1) continue;
            int dif = Math.abs(x - i);
            if (dif < min) {
                min = dif;
                index = i;
            }
        }
        System.out.println(index);
    }
}