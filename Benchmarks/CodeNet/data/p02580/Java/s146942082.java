import java.util.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	int m = sc.nextInt();
    	int[] harr = new int[h];
    	int[] warr = new int[w];
    	HashSet<Long> used = new HashSet<>();
    	for (int i = 0; i < m; i++) {
    	    int hh = sc.nextInt() - 1;
    	    int ww = sc.nextInt() - 1;
    	    harr[hh]++;
    	    warr[ww]++;
    	    used.add((long)w * hh + ww);
    	}
        int hmax = 0;
        ArrayList<Integer> hlist = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            if (hmax <= harr[i]) {
                if (hmax < harr[i]) {
                    hlist.clear();
                    hmax = harr[i];
                }
                hlist.add(i);
            }
        }
        int wmax = 0;
        ArrayList<Integer> wlist = new ArrayList<>();
        for (int i = 0; i < w; i++) {
            if (wmax <= warr[i]) {
                if (wmax < warr[i]) {
                    wlist.clear();
                    wmax = warr[i];
                }
                wlist.add(i);
            }
        }
        for (int hh : hlist) {
            for (int ww : wlist) {
                if (!used.contains((long)w * hh + ww)) {
                    System.out.println(hmax + wmax);
                    return;
                }
            }
        }
        System.out.println(hmax + wmax - 1);
    }
    
    static class Path implements Comparable<Path> {
        int h;
        int w;
        int value;
        
        public Path(int h, int w, int value) {
            this.h = h;
            this.w = w;
            this.value = value;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
        
        public String toString() {
            return h + ":" + w + ":" + value;
        }
    }
}

