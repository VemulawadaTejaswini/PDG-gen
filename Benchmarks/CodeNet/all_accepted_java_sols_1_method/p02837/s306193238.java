import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        Map<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            HashMap<Integer, Integer> m = new HashMap<>();
            for (int j = 0; j < A[i]; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                m.put(a, b);
            }
            map.put(i, m);
        }
        int[] x = new int[N];
        int[] y = new int[N];
        int ans = 0;
        int tmp = 0;

        for (int i = 0; i < (1 << N); i++) {
            int[] xy = new int[N];
            int count = 0;
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) == (1 << j)) {
                    xy[j] = 1;
                    count++;
                }
            }
            boolean ok = true;
            for (int j = 0; j < N; j++) {
                if (xy[j] == 0) continue;
                HashMap<Integer, Integer> b = map.get(j);
                for (Map.Entry<Integer, Integer> e : b.entrySet()) {
                    if(xy[e.getKey() - 1] != e.getValue()){
                        ok = false;
                    };
                }
            }
            if (ok && ans <= count) {
                ans = count;
            }
        }
        System.out.println(ans);
    }
}