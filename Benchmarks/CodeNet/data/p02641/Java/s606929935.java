import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

//	public static int min = 3000000;

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		long k = sc.nextLong();
		int x = sc.nextInt();
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i]= sc.nextInt();
		}

		//-------------------------------------------------------------------------------------
		int tmp = 10000;
		ans = 1000;
		for(int i = 1; i <= 100; i++) {
			f = false;
			for(int j = 0; j < n; j++) {
				if(i == a[j]) {
					f = true;
					break;
				}
			}
			if(f) continue;
			if(tmp > Math.abs(x - i)) {
				ans = i;
				tmp = Math.abs(x - i);
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