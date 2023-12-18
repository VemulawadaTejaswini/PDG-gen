import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashSet<Integer> set = new HashSet<Integer>();
	int N = Integer.parseInt(sc.next());
	int[] a = new int[N+1];
	for(int i = 1; i<=N; i++) {
	    a[i] = Integer.parseInt(sc.next());
	}
	int next = 1;
	int cnt = 0;
	for(int i = 0; i<N; i++) {
	    if(next == 2) {
		System.out.println(cnt);
		return;
	    }
	    if(set.contains(next)) {
		System.out.println(-1);
		return;
	    }
	    set.add(next);
	    next = a[next];
	    cnt++;
	}
	System.out.println(cnt);
    }
}