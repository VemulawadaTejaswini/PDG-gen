

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int ans = 0;

//		for(int i=1 ; i<n ; i++) {
//			for(int j=1 ; j<n ; j++) {
//				for(int k=1 ; k<n ; k++) {
//					if(i * j + k == n) {
//						ans++;
//					}
//				}
//			}
//		}

		int c = 1;
//		if(n==2) {
//			ans = 1;
//		}else{
//			while(n-c >= 1) {
//				for(int a=1 ; a<n ; a++) {
//					if( (n-c)%a == 0 ) {
//						if(a > (n-c)/a) {
//							ans = ans * 2;
//							break;
//						}else if(a == (n-c)/a) {
//							ans = ans * 2 - 1;
//							break;
//						}
//						ans++;
//					}
//				}
//				c++;
//			}
//		}

		if(n==2) {
			ans = 1;
		}else{
			while(n-c >= 1) {
				for(int a=1 ; a<n ; a++) {
					if( (n-c)%a == 0 ) {

						ans++;
					}
				}
				c++;
			}
		}

		System.out.println(ans);

		sc.close();

	}

}
