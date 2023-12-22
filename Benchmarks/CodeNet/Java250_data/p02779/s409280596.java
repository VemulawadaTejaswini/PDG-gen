import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		// input
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		Set<Integer> task = new HashSet<>();
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		// 同じ構造でもArrayListだとTLEで死ぬ
		for (int i = 0; i < a.length; i++){
		    if(task.contains(a[i])) {
		    	System.out.println("NO");
		    	return;
		    }
		    task.add(a[i]);
		}
		System.out.println("YES");		
	}
}