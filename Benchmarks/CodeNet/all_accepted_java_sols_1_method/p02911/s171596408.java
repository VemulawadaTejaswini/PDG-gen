import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), q = sc.nextInt();
		int a[] = new int[q];
		String ans[] = {"Yes", "No"};
		int an = 0;
		for(int i = 0; i < q; ++i){
			a[i] = sc.nextInt();
		}
		sc.close();
		long point[] = new long[n];
		for(int i = 0; i < q; ++i){
			int t = a[i] - 1;
			point[t]++;
		}
		long add = k - q;
		for(int i = 0; i < n; ++i){
			point[i] += add;
			if(point[i] <= 0)an = 1;
			System.out.println(ans[an]);
			an = 0;
		}
	}
}
