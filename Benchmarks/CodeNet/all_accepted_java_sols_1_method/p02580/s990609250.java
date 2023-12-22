
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0 ; i < m ; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
        }
        Set<Long> pair = new HashSet<>();
        for (int i = 0 ; i < m ; i++) {
            pair.add((long) a[i] * 100000 + b[i]);
        }
        int[] c = new int[h];
        int[] d = new int[w];
        for (int i = 0 ; i < m ; i++) {
            c[a[i]]++;
            d[b[i]]++;
        }
        int hmax = 0;
        int wmax = 0;
        for (int i = 0 ; i < h ; i++) {
            if (c[i] > hmax) {
                hmax = c[i];
            }
        }
        for (int i = 0 ; i < w ; i++) {
            if (d[i] > wmax) {
                wmax = d[i];
            }
        }
        Set<Integer> seth = new HashSet<>();
        Set<Integer> setw = new HashSet<>();
        for (int i = 0 ; i < h ; i++) {
            if (c[i] == hmax) {
                seth.add(i);
            }
        }
        for (int i = 0 ; i < w ; i++) {
            if (d[i] == wmax) {
                setw.add(i);
            }
        }

        if ((long) seth.size() * setw.size() > m) {
            System.out.println(hmax + wmax);
            return;
        }

        for (int x : seth) {
            for (int y : setw) {
                long key = (long) 100000 * x + y;
                if (!pair.contains(key)) {
                    System.out.println(hmax + wmax);
                    return;
                }
            }
        }
        System.out.println(hmax + wmax - 1);


    }

}
