import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		long ans2 = 0;
//		long ans = 0;

		Scanner sc = new Scanner(System.in);


//		int n = sc.nextInt();

//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

//		boolean f = true;
//
//		int[] a = new int[n];
//		int[] b = new int[n];
//		int[] aa = new int[n];
//		int[] bb = new int[n];
//		for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//		}
//		for (int i = 0; i < n; i++) {
//			b[i] = sc.nextInt();
//			bb[i] = b[i];
//		}

		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans  = 0;
		if(x == 1) {
			ans += 300000;
		} else if(x == 2){
			ans += 200000;
		}else if(x == 3) {
			ans += 100000;
		}
		if(y == 1) {
			ans += 300000;
		} else if(y == 2){
			ans += 200000;
		}else if(y == 3) {
			ans += 100000;
		}
		if(y == 1 && x == 1) {
			ans += 400000;
		}


		System.out.println(ans);

		sc.close();
	}
}