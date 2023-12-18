import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();

	Map<Integer,HashSet<Integer>> map = new HashMap<Integer,HashSet<Integer>>();
	for (int i=0; i<m; i++) {
	    int a = sc.nextInt() - 1;
	    int b = sc.nextInt() - 1;
	    Iterator ai = map.get(a).iterator();
	    Iterator bi = map.get(b).iterator();
	    HashSet<Integer> ah = new HashSet<Integer>();
	    HashSet<Integer> bh = new HashSet<Integer>();
	    ah.add(b);
	    bh.add(a);
	    while (bi.hasNext()) {
		ah.add((int)(bi.next()));
	    }
	    while (ai.hasNext()) {
		bh.add((int)(ai.next()));
	    }
	    map.put(a,ah);
	    map.put(b,bh);
	}
	int max = 0;
	for (int i=0; i<n; i++) {
	    if (map.get(i).size() > max) {
		max = map.get(i).size();
	    }
	}
	System.out.print(max);
    }
}
