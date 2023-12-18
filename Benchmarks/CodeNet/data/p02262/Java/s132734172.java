import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int[] g = {n - 1, 1};
        int cnt = shellSort(a, g);
        System.out.println(g.length);
        print(g);
        System.out.println(cnt);
        for (int i : a) {
            System.out.println(i);
        }
    }

    private static int insertionSort(int[] a, int g) {
        int cnt = 0;
        for (int i = g; i < a.length; i++) {
            int v = a[i];
            int j = i - g;
            while (j >= 0 && a[j] > v) {
                a[j + g] = a[j];
                j -= g;
                cnt++;
            }
            a[j + g] = v;
        }
        return cnt;
    }

    private static int shellSort(int[] a, int[] g) {
        int cnt = 0;
        for (int i = 0; i < g.length; i++) {
            cnt += insertionSort(a, g[i]);
        }
        return cnt;
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(" ");
            } else {
                System.out.println("");
            }
        }
    }
}