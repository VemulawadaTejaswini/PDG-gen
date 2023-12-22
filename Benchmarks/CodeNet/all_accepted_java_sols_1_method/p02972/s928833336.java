import java.util.*;

public class Main {
    static final int MOD = 1000000007;
 	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] arr = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
		    arr[i] = (sc.nextInt() == 1);
		}
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = n; i >= 1; i--) {
		    int count = 0;
		    for (int j = 2; j * i <= n; j++) {
		        if (set.contains(j * i)) {
		            count++;
		        }
		    }
		    if (count % 2 == 1 ^ arr[i]) {
		        set.add(i);
		    }
		}
		System.out.println(set.size());
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for (int x : set) {
		    if (flag) {
		        sb.append(" ");
		    }
		    flag = true;
		    sb.append(x);
		}
		System.out.println(sb);
	}
}
