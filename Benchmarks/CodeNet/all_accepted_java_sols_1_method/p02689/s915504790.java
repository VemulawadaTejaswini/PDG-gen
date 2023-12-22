import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<List<Integer>> obs = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			obs.add(new ArrayList<>());
		}
		
		int[] h = new int[n];
		Arrays.setAll(h, i -> sc.nextInt());
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			
			obs.get(a).add(b);
			obs.get(b).add(a);
		}
		
		int cnt = 0;
		
		outer:
		for (int i = 0; i < n; i++) {
			List<Integer> list = obs.get(i);
			
			int size = list.size();
			if (size == 0) {
				cnt++;
				continue;
			}
			
			for (int j = 0; j < size; j++) {
				if (h[i] <= h[list.get(j)]) {
					continue outer;
				}
			}
			
			cnt++;
		}
		
		System.out.println(cnt);
		
	}
}
