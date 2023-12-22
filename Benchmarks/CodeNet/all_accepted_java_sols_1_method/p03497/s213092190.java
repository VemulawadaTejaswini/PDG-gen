
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int k = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			a[tmp]++;
		}
		int cnt = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i < n + 1; i++) {
			if(a[i] > 0)
				list.add(a[i]);
		}
		int ans = 0;
		Collections.sort(list);
		for(int i = 0; i < list.size() - k; i++) {
			ans += list.get(i);
		}
		System.out.println(ans);
	}

}
