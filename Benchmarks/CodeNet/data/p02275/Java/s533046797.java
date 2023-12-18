import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total;

        Scanner inp = new Scanner(System.in);
        total = inp.nextInt();

        int[] a = new int[total];

        for (int k = 0; k < total; k++) {
            a[k] = inp.nextInt();
        }

        countingSort(a, new int[total], 2000000);
    }

    public static void countingSort(int[] a, int[] b, int k) {
        int[] c = new int[k];

        for (int j = 0; j < a.length; j++) {
            c[a[j]]++;
        }

        for (int i = 1; i < k; i++) {
            c[i] += c[i - 1];
        }

        for (int j = a.length-1; j >= 0; j--) {
            b[c[a[j]]-1] = a[j];
            c[a[j]]--;
        }

        StringBuilder s = new StringBuilder();
        int place = 0;
        for(int item : b) {
            if (place != 0) {
                s.append(" ");

            }

            s.append(item+"");
            place++;
        }

        System.out.print(s + "\n");

    }
}
