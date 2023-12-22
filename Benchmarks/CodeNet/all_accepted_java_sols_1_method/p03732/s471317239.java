import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(i, new ArrayList<>());
        }

        int[] t = new int[4];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
            if (i == 0) {
                t[0]++;
                map.get(0).add(v[i]);
            } else {
                int idx = w[i] - w[0];
                t[idx]++;
                map.get(idx).add(v[i]);
            }
        }

        for (int i = 0; i < 4; i++) {
            map.get(i).sort(Integer::compare);
            Collections.reverse(map.get(i));
        }

        long ans = 0;
        long vsum0 = 0;
        for (int i0 = 0; i0 <= t[0]; i0++) {
            if (i0 != 0) {
                vsum0 += map.get(0).get(i0 - 1);
            }
            long vsum1 = 0;
            for (int i1 = 0; i1 <= t[1]; i1++) {
                if (i1 != 0) {
                    vsum1 += map.get(1).get(i1 - 1);
                }
                long vsum2 = 0;
                for (int i2 = 0; i2 <= t[2]; i2++) {
                    if (i2 != 0) {
                        vsum2 += map.get(2).get(i2 - 1);
                    }
                    long vsum3 = 0;
                    for (int i3 = 0; i3 <= t[3]; i3++) {
                        if (i3 != 0) {
                            vsum3 += map.get(3).get(i3 - 1);
                        }
                        long wsum = 0;
                        wsum += (long) i0 * w[0];
                        wsum += (long) i1 * (w[0] + 1);
                        wsum += (long) i2 * (w[0] + 2);
                        wsum += (long) i3 * (w[0] + 3);

                        long vsum = vsum0 + vsum1 + vsum2 + vsum3;

                        if (wsum <= W) {
                            ans = Math.max(vsum, ans);
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
