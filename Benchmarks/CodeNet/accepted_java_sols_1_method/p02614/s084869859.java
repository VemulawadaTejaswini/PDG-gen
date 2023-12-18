
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = Integer.parseInt(scan.next());
        int w = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        int[][] c = new int[h][w];
        for (int i = 0; i < h; i++) {
            String[] s = scan.next().split("");
            for (int j = 0; j < w; j++) {
                if (s[j].equals(".")) {
                    c[i][j] = 0;
                } else {
                    c[i][j] = 1;
                }
            }
        }
        scan.close();

        long ans = 0;
        for (int i = 0; i < (1 << h); i++) {
            Set<Integer> iSet = new HashSet<Integer>();
            for (int a = 0; a < h; a++) {
                if ((i & (1 << a)) != 0) {
                    iSet.add(a);
                }
            }

            for (int j = 0; j < (1 << w); j++) {
                Set<Integer> jSet = new HashSet<Integer>();
                for (int a = 0; a < w; a++) {
                    if ((j & (1 << a)) != 0) {
                        jSet.add(a);
                    }
                }

                int black = 0;
                for (int a = 0; a < h; a++) {
                    if (iSet.contains(a)) {
                        continue;
                    }
                    for (int b = 0; b < w; b++) {
                        if (jSet.contains(b)) {
                            continue;
                        }
                        black += c[a][b];
                    }
                }

                if (black == k) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
