import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static class Pair implements Comparable<Pair>{
		public int first=0,second=0;

		@Override
		public int compareTo(Pair other) {
			return other.second-this.second;
		}
		
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, m;
		while (true) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			Pair[] a = new Pair[m];
			for (int i = 0; i < m; i++) {
				a[i]=new Pair();
				a[i].first=i+1;
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[j].second += scanner.nextInt();
				}
			}
			Arrays.sort(a);
			for (int i = 0; i < m; i++)
				System.out.print(a[i].first + (i == m - 1 ? "" : " "));
			System.out.println();
		}
	}
}