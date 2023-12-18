import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static long counter = 0;

    public static void main(String[] args) {
        int total;

        Scanner inp = new Scanner(System.in);
        total = inp.nextInt();

        long[] a = new long[total];

        for (int k = 0; k < total; k++) {
            a[k] = inp.nextInt();
        }

        merge_sort(a, 0, a.length);

        System.out.println(counter);
    }

    public static void merge(long[] a, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        long[] l = new long[n1+1];
        long[] r = new long[n2+1];

        for (int i = 0; i < n1; i++) {
            l[i] = a[left + i];
        }

        for (int i = 0; i < n2; i++) {
            r[i] = a[mid + i];
        }

        l[n1] = Integer.MAX_VALUE;
        r[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = left; k < right; k++) {
            if (l[i] <= r[j]) {
                a[k] = l[i++];
            } else {
                a[k] = r[j++];
                counter += n1-i;
            }
        }
    }

    public static void merge_sort(long[] a, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            merge_sort(a, left, mid);
            merge_sort(a, mid, right);
            merge(a, left, mid, right);
        }
    }
}

