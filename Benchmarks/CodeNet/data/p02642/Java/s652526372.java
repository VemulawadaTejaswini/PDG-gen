import java.util.ArrayList;
import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		long ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();

		int n = sc.nextInt();

		long[] a = new long[n];
		ArrayList<Long> list = new ArrayList<>();
		ArrayList<Long> list2 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			long t = sc.nextLong();
			a[i] = t;
			list.add(t);
		}

		//-------------------------------------------------------------------------------------

		for(int i = 0; i < n; i++) {
			f = true;
			if(!list.contains(a[i]))
				continue;
			if(list2.contains(a[i])) {
				continue;
			}
			for(int j = i + 1; j < n; j++) {
				System.err.println(a[i]+ " " + a[j]);
				if(a[j] % a[i] == 0) {
					list2.add(a[j]);
				}
				if(i == j) continue;
				if(a[i] % a[j] == 0) {
					list.remove(a[i]);
					f = false;
					break;
				}
			}
			if(f) {
//				System.err.println(i);
				ans++;
			}
		}

		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}



}