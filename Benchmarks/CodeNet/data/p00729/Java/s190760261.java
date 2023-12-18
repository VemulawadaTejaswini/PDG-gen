import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (N + M == 0)
                break;
            List<int[]> list[] = new List[N];
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<int[]>();
            }
            int r = sc.nextInt();
            for (int i = 0; i < r; i++) {
                int t = sc.nextInt();
                int n = sc.nextInt() - 1;
                int m = sc.nextInt() - 1;
                int s = sc.nextInt();
                list[n].add(new int[] { t, m });
            }

            int q = sc.nextInt();
            for (int iii = 0; iii < q; iii++) {
                int t1 = sc.nextInt();
                int t2 = sc.nextInt();
                int n = sc.nextInt() - 1;
                int[][] sec = getSection(list, n);
                if (sec[0] == null) {
                    System.out.println(0);
                    continue;
                }
                Arrays.sort(sec, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] a, int[] b) {
                        return a[0] - b[0];
                    }
                });
                int ans = 0;
                for (int i = 0; i < sec.length;) {
                    int s = sec[i][0];
                    int t = sec[i][1];
                    for (i++; i < sec.length; i++) {
                        if (t < sec[i][0])
                            break;
                        t = Math.max(t, sec[i][1]);
                    }
                    s = Math.max(s, t1);
                    t = Math.min(t, t2);
                    ans += Math.max(t - s, 0);
                }
                System.out.println(ans);
            }
        }
    }

    static int[][] getSection(List<int[]>[] list, int n) {
        List<int[]> secs = new LinkedList<int[]>();
        for (List<int[]> l : list) {
            boolean login = false;
            int prev = -1;
            for (int[] a : l) {
                if (a[1] != n)
                    continue;
                if (login) {
                    secs.add(new int[] { prev, a[0] });
                } else {
                    prev = a[0];
                }
                login = !login;
            }
        }
        return secs.toArray(new int[][] { {} });
    }
}