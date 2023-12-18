import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int cnt;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        shellSort(a, n);
    }

    private static void insertionSort(int[] a, int n, int g) {
        for (int i = g; i < n; i++) {
            int v = a[i];
            int j = i - g;
            while (j >= 0 && a[j] > v) {
                a[j+g] = a[j];
                j = j- g;
                cnt++;
            }
            a[j+g] = v;
        }
    }

    private static void shellSort(int[] a, int n) {
        cnt = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; Math.pow(2, i) - 1 <= n; i++) {
            al.add((int) Math.pow(2, i) - 1);
        }
        Integer[] g = al.toArray(new Integer[0]);
        int m = g.length;
        System.out.println(m);
        System.out.println(printArray(g));
        for (int i = m - 1; i >= 0; i--) {
            insertionSort(a, n, g[i]);
        }
        System.out.println(cnt);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    private static String printArray(Integer[] a) {
        int length = a.length;
        String arrayString = "";
        for (int i = length - 1; i > 0; i--) {
            arrayString = arrayString + a[i] + " ";
        }
        arrayString = arrayString + a[0];
        return arrayString;
    }
}

