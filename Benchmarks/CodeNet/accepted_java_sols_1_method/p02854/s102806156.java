import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		long ans2 = 0;
		long ans = 0;
//		int ans = 0;

		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
//		int x = sc.nextInt();
//		int y = sc.nextInt();

//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

//		boolean f = true;
//
		long[] a = new long[n];
//		int[] b = new int[n];
//		int[] aa = new int[n];
//		int[] bb = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
//		for (int i = 0; i < n; i++) {
//			b[i] = sc.nextInt();
//			bb[i] = b[i];
//		}


		long r = 0;
		long l = 0;
		int index = n;
		int tmp = 0;

		if(n % 2 == 0) {
			for(int i =0; i<index; i++) {
				r += a[i];
				if(r > l) {
					while(r > l) {
						index--;
						if(i==index) break;
						l += a[index];
					}
				}
			}
		} else {
			for(int i =0; i<index; i++) {
				tmp = i;
				r += a[i];
				if(r > l) {
					while(r > l) {
						index--;
						if(i==index) break;
						l += a[index];
					}
				}
			}
//			l = l - a[tmp];
		}

		ans = Math.abs(r-l);

//		System.out.println(r);
//		System.out.println(l);
		System.out.println(ans);

		sc.close();
	}
}