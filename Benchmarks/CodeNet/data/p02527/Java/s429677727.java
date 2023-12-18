import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Main s = new Main();
        s.sort(a);
    }

    int pivot(int[] a, int i, int j) {
        int k = i + 1;
        while (k <= j && a[i] == a[k]) {
            k++;
        }
        if (k > j) {
            return -1;
        }
        if (a[i] >= a[k]) {
            return i;
        }
        return k;
    }

    int partition(int[] a, int i, int j, int x) {
        int l = i, r = j;
        while (l <= r) {
            while (l <= j && a[l] < x) {
                l++;
            }
            while (r >= i && a[r] >= x) {
                r--;
            }
            if (l > r) {
                break;
            }
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
        return l;
    }

    public void quickSort(int[] a, int i, int j) {
        if (i == j) {
            return;
        }
        int p = pivot(a, i, j);
        if (p != -1) {
            int k = partition(a, i, j, a[p]);
            quickSort(a, i, k - 1);
            quickSort(a, k, j);
        }
    }

    public void sort(int[] a) {
        quickSort(a, 0, a.length -1 );
        String out = "";
        for (int i = 0; i < a.length; i++) {
            out += a[i] + " ";
        }
        System.out.println(out + "\b");
    }
}