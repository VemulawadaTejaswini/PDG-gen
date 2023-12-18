import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        int m = in.nextInt();
        Map<Integer, Integer> hmap = new HashMap<>();
        Map<Integer, Integer> wmap = new HashMap<>();
        Set<Integer>[] board = new Set[h+1];
        for(int i=1; i<h+1; i++) {
            board[i] = new HashSet<>();
        }
        for(int i=0; i<m; i++) {
            int hi = in.nextInt();
            if(hmap.containsKey(hi)) {
                hmap.put(hi, hmap.get(hi)+1);
            }
            else {
                hmap.put(hi, 1);
            }
            int wi = in.nextInt();
            if(wmap.containsKey(wi)) {
                wmap.put(wi, wmap.get(wi)+1);
            }
            else {
                wmap.put(wi, 1);
            }
            board[hi].add(wi);
        }
        int hmax = 0;
        Iterator<Integer> it = hmap.values().iterator();
        while(it.hasNext()) {
            hmax = Math.max(hmax, it.next());
        }
        int wmax = 0;
        it = wmap.values().iterator();
        while(it.hasNext()) {
            wmax = Math.max(wmax, it.next());
        }
        
        Set<Integer> hCandidates = new HashSet<>();
        it = hmap.keySet().iterator();
        while(it.hasNext()) {
            int key = it.next();
            if(hmap.get(key) == hmax) {
                hCandidates.add(key);
            }
        }
        Set<Integer> wCandidates = new HashSet<>();
        it = wmap.keySet().iterator();
        while(it.hasNext()) {
            int key = it.next();
            if(wmap.get(key) == wmax) {
                wCandidates.add(key);
            }
        }
        
        boolean exists = true;
        it = hCandidates.iterator();
        while(it.hasNext()) {
            int hi = it.next();
            Iterator<Integer> it2 = wCandidates.iterator();
            while(it2.hasNext()) {
                int wi = it2.next();
                if(!board[hi].contains(wi)) {
                    exists = false;
                    break;
                }
            }
            if(!exists) {
                break;
            }
        }
        System.out.println(hmax + wmax - (exists ? 1 : 0));
    }
}
