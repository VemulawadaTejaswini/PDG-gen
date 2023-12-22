import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// N
		int N = sc.nextInt();
		// M
		int M = sc.nextInt();
		// X
		int X = sc.nextInt();
		
		int[] a = new int[M];
		for (int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
		}
		
		int ryouhinn1 =0;
		for (int i = X+1; i < N; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					ryouhinn1++;
				}
			}
		}
		int ryouhinn2 =0;
		for (int i = X-1; i >=0; i--) {
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					ryouhinn2++;
				}
			}
		}
		
		
		if (ryouhinn1 > ryouhinn2 ) {
			System.out.println(ryouhinn2);
		} else {
			System.out.println(ryouhinn1);
		}
		
//1		// 出力
//		
//		for (int i = 0; i < b; i++) {
//			if (a + i == x) {
//				System.out.println("YES");
//				return;
//			}
//		}
//		System.out.println("NO");
		
		
	}
}

