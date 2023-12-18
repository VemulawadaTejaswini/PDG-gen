
import java.util.*;
import java.lang.*;

public class Main {

    static int n;
    static int[] a;
    static int count;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        count = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        mergeSort(0, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i != n - 1) {
                System.out.print(' ');
            }
        }
        System.out.println();
        System.out.println(count);
    }
    
    static void merge(int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] l = new int[n1 + 1];
        int[] r = new int[n2 + 1];
        
        for (int i = 0; i < n1; i++) {
            l[i] = a[left + i];
        }
        for (int i = 0; i < n2; i++) {
            r[i] = a[mid + i];
        }
        l[n1] = Integer.MAX_VALUE;
        r[n2] = Integer.MAX_VALUE;
        int i = 0, j = 0;
        for (int k = left; k < right; k++) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
            count++;
        }
    }

    static void mergeSort(int left, int right) {
        if (left + 1 >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(left, mid);
        mergeSort(mid, right);
        merge(left, mid, right);
        /*
         System.out.print("(" + left + ", " + right + ")  ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i != n - 1) {
                System.out.print(' ');
            }
        }
        System.out.println();
         */
        return;
    }
}

