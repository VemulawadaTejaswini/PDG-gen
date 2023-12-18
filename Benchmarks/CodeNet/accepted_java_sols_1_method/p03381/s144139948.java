import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		
		for (int i=0;i<n;i++) {
			x[i] = sc.nextInt();
		}
		
		int[] s_x = x.clone();
		Arrays.sort(s_x);
		for (int e : x) {
			if (e >= s_x[n/2]) {
				System.out.println(s_x[n/2-1]);
			} else {
				System.out.println(s_x[n/2]);
			}
		}
	}
}