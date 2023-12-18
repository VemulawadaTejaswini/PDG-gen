import java.util.*;
import java.lang.*;

/**
 * SelectionSort
 */
public class Main
 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(sc.next());
        }

        int num = MySelectionSort(list, n);

        for (int i = 0; i < list.length; i++) {
            if (i == list.length - 1) {
                System.out.print(list[i]);

            } else {
                System.out.print(list[i] + " ");
            }
        }
        System.out.println("");
        System.out.println(num);
    }

    private static int MySelectionSort(int[] list, int n) {
        int num = 0;
        for (int i = 0; i < n; i++) {
            int minj = i;
            for (int j = i; j < n; j++) {
                if (list[j] < list[minj]) {
                    minj = j;
                }
            }

            if (i != minj) {
                int tmp = list[i];
                list[i] = list[minj];
                list[minj] = tmp;
                num++;
            }
        }

        return num;
    }
}
