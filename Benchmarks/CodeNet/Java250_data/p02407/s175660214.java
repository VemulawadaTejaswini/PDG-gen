import java.util.*;
import java.lang.*;

/**
 * ReversingNumbers
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print(array[n - 1]);

        for (int i = 1; i < n; i++) {
            System.out.print(" " + array[n - i - 1]);
        }
        System.out.println();
    }
}
