import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] a = new int[M];
        int[] b = new int[M];
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<M; i++) {
            a[i] = Integer.parseInt(sc.next());
            b[i] = Integer.parseInt(sc.next());
            if(map.containsKey(a[i])) map.get(a[i]).add(b[i]);
            else {
                map.put(a[i], new ArrayList<Integer>());
                map.get(a[i]).add(b[i]);
            }
            if(map.containsKey(b[i])) map.get(b[i]).add(a[i]);
            else {
                map.put(b[i], new ArrayList<Integer>());
                map.get(b[i]).add(a[i]);
            }
        }
        
        String ans = "IMPOSSIBLE";
        for(int x : map.get(1)) {
            for(int y : map.get(x)) {
                if(y == N) {
                    ans = "POSSIBLE";
                    break;
                }
            }
        }
        System.out.println(ans);
        
        
    }
}
