import java.util.ArrayList;
import java.util.Scanner;


public class Main {


	final static int MOD = 1000000007;

	public static long ans = 0;

	public static void main(String[] args) {

//		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long a = sc.nextLong();

		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}

		ArrayList<ArrayList<Long>> list = new ArrayList<>();
		ArrayList<Long> tmplist = new ArrayList<>();

		//-------------------------------------------------------------------------------------

		ncr(list, n, k, tmplist, a);
		System.err.println(list.size());
		for(ArrayList<Long> tmp : list) {
			long calc = 1;
			for(long l : tmp) {
				calc *= l;
				System.err.print(l + " ");
			}
			System.err.println();
			if(ans < calc) {
				ans = calc;
			}
		}

		ans = ans % MOD;
		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}


	public static void ncr(ArrayList<ArrayList<Long>> list, int n, int r, ArrayList<Long> tmplist, long[] a) {
		if(tmplist.size() >= r) {
			list.add(tmplist);
			return;
		}

		for(int i = 0; i < n; i++) {
			if(!tmplist.contains(a[i])) {
				ArrayList<Long> tmp = new ArrayList<>(tmplist);
				tmp.add(a[i]);
				ncr(list, n, r, tmp, a);
			}
		}
	}
}