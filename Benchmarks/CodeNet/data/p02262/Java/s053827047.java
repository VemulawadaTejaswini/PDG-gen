import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        List<Integer> g = new ArrayList<Integer>();
        int h = 1;
        while (h < n) {
            g.add(h);
            h = 3 * h + 1;
        }
        int cnt = shellSort(a, g);
        System.out.println(g.size());
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

    private static int shellSort(int[] a, List<Integer> g) {
        int cnt = 0;
        for (int i = g.size() - 1; i >= 0; i--) {
            cnt += insertionSort(a, g.get(i));
        }
        return cnt;
    }

    private static void print(List<Integer> g) {
        for (int i = g.size() - 1; i >= 0; i--) {
            System.out.print(g.get(i));
            if (i < g.size() - 1) {
                System.out.print(" ");
            } else {
                System.out.println("");
            }
        }
    }
}