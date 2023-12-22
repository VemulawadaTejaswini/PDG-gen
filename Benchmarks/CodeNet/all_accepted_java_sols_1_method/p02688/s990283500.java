import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = scanner.nextInt();
		int[] d = new int[n];
		List<Integer> a[] = new ArrayList[k];
		for (int i = 0 ; i < n ; i ++) {
			int di = scanner.nextInt();
			d[i] = di;
			for (int j = 0 ; j < di ; j ++) {
				int aj = scanner.nextInt();
				List<Integer> ajtemp = a[aj - 1];
				if (ajtemp == null ) {
					ajtemp = new ArrayList<>();
				}
				ajtemp.add(ajtemp.size() + 1);
				a[aj - 1] = ajtemp;
			}
		}
		int ans = 0;
		for (List<Integer> temp : a) {
			if (temp == null || temp.size() == 0) {
				ans ++;
			}
		}
		System.out.println(ans);
		scanner.close();
	}
}