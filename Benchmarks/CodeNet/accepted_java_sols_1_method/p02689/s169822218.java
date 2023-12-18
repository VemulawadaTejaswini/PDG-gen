import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] h = new long[n];
        for(int i=0; i<n; i++) {
            h[i] = in.nextLong();
        }
        
        Set<Integer>[] roads = new Set[n];
        for(int i=0; i<n; i++) {
            roads[i] = new HashSet<>();
        }
        
        for(int i=0; i<m; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            roads[a].add(b);
            roads[b].add(a);
        }
        
        int ans = 0;
        for(int i=0; i<n; i++) {
            Set<Integer> road = roads[i];
            Iterator<Integer> it = road.iterator();
            boolean isGood = true;
            while(it.hasNext()) {
                int dest = it.next();
                if(h[i] <= h[dest]) {
                    isGood = false;
                    break;
                }
            }
            if(isGood) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
