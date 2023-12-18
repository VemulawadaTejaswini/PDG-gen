import java.util.Scanner;
import java.util.TreeMap;


public class Main {


//	final int MOD = 1000000007;


	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();

		TreeMap< String, Integer> map = new TreeMap<String, Integer>();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			map.put(sc.next(), i);
		}

		//-------------------------------------------------------------------------------------

		ans = map.size();

		//-------------------------------------------------------------------------------------

//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}
}