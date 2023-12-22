import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] A = new int[N];
        long[] ruiseki = new long[N+1];
        for (int i=0;i<N;i++) {
            A[i] = Integer.parseInt(sc.next());
            ruiseki[i+1] = ruiseki[i] + A[i];
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<N+1;i++) {
            int r = (int)(ruiseki[i]%M);
            if (map.containsKey(r)) {
                map.put(r, map.get(r)+1);
            } else {
                map.put(r, 1);
            }
        }
        ArrayList<Integer> value = new ArrayList<Integer>(map.values());
        long ans = 0L;
        for (Integer i : value) {
            ans += (long)i*(i-1)/2;
        }
        // System.out.println(map);
        // System.out.println(value);
        System.out.println(ans);
    }
}