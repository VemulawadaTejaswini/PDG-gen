import java.util.*;

import javax.lang.model.type.ArrayType;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; ++i)
		a[i] = sc.nextInt();
		sc.close();
		Arrays.sort(a);
		long ans = 0;
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(a[n - 1]);
		for(int i = n - 2; i >= 0; --i){
			int tmp = queue.poll();
			ans += (long)tmp;
			tmp = a[i];
			queue.add(tmp);
			queue.add(tmp);
		}
		System.out.println(ans);
	}
}
