import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long[] arr = new long[(int) n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		//一項目を負にするか正にするか
		long seiT = 0L;
		long ruisekiWA = 0L;
		for(int i = 0; i < n; i++) {//正のとき
			ruisekiWA += arr[i];
			if(i%2==0) {//正にする
				if(ruisekiWA > 0) {

				} else {
					seiT += 1 - ruisekiWA;
					ruisekiWA = 1;
				}
			} else {//負にする
				if(ruisekiWA < 0) {

				} else {
					seiT += ruisekiWA + 1;
					ruisekiWA = -1;
				}
			}
		}
		long fuT = 0L;
		ruisekiWA = 0L;
		for(int i = 0; i < n; i++) {//負のとき
			ruisekiWA += arr[i];
			if(i%2==0) {//負にする
				if(ruisekiWA < 0) {

				} else {
					fuT += ruisekiWA + 1;
					ruisekiWA = -1;
				}
			} else {//正にする
				if(ruisekiWA > 0) {

				} else {
					fuT += 1 - ruisekiWA;
					ruisekiWA = 1;
				}
			}
		}
		System.out.println(Math.min(seiT, fuT));
	}
}