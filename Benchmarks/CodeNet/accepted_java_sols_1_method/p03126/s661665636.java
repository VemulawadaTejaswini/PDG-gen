import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int m = sc.nextInt();

		int[] l = new int[m];
		for (int i = 0; i < n; ++i) {
			int c = sc.nextInt();
			for (int j = 0; j < c; ++j) {
				int x = sc.nextInt();
				l[x - 1] += 1;
			}
		}
		int r = 0;
		for (int i = 0; i < m; ++i) {
			if(l[i] == n) {
				r++;
			}
		}
		System.out.println(r);
	}
}