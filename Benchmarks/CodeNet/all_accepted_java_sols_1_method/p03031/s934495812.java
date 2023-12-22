import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = reader.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] k = new int[m];
        int[][] s = new int[m][];
        for (int i = 0; i < m; i++) {
            String[] arr = reader.readLine().split(" ");
            k[i] = Integer.parseInt(arr[0]);
            s[i] = new int[k[i]];
            for (int j = 0; j < k[i]; j++) {
                s[i][j] = Integer.parseInt(arr[j + 1]);
            }
        }
        String[] parr = reader.readLine().split(" ");
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(parr[i]);
        }
        int maxState = 1 << n;
        Set<Integer> set = new HashSet<>(maxState);
        for (int i = 0; i < maxState; i++) {
            set.add(i);
        }
        for (int i = 0; i < m; i++) {
            for (Iterator<Integer> iter = set.iterator(); iter.hasNext(); ) {
                int cur = iter.next();
                int count = 0;
                for (int j = 0; j < k[i]; j++) {
                    int tmp = (cur >> (s[i][j] - 1)) & 1;
                    if (tmp == 1) {
                        count++;
                    }
                }
                if (count % 2 != p[i]) {
                    iter.remove();
                }
            }
        }
        System.out.println(set.size());
    }
}
