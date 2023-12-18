import java.util.*;

public class Main {
	static int[] a;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			if(hm.containsKey(a[i]) && hm.get(a[i]) == 1) {
				hm.put(a[i], 0);
			} else {
				hm.put(a[i], 1);
			}
		}
		int cout = 0;
		for(int key : hm.keySet()) {
			if(hm.get(key) == 1) {
				cout++;
			}
		}
		System.out.println(cout);
	}
}