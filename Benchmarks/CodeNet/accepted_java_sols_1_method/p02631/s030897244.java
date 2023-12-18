
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        int all = a[0];
        for (int i = 1; i < n; i++) {
            all ^= a[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print((all ^ a[i]) + " ");
        }
        System.out.println("");
    }

}
