import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long ans = 0;

		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
//		longd = sc.nextInt();
//
		boolean f = false;
		int[] array = new int [n+1];
		int[] array2 = new int[n];
		for (int i = 0; i < n+1; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			array2[i] = sc.nextInt();
		}

		long  tmp = 0;
		for (int i = 0; i < n+1; i++) {
			if(tmp > 0) {
				if(array[i]>=tmp) {
					ans = ans + tmp;
					array[i] = array[i] - (int)tmp;
				} else {
					ans = ans + array[i];
					array[i]=0;
				}
				tmp = 0;
			}
			if(i == n) {
				continue;
			}
			if(array[i] >= array2[i]) {
				ans = ans + array2[i];
				tmp = 0;
			} else {
				ans = ans + array[i];
				tmp  = (array2[i] - array[i]);
			}
//			System.out.println(ans);
		}

		System.out.println(ans);

		sc.close();
	}
}