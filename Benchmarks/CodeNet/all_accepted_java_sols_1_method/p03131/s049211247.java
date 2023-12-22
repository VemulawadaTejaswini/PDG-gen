import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		long deff = b-a;

		if(deff <= 2) {
			// 2以下ならたたき続けたほうがいい
			System.out.println(k + 1);
			return;
		}

		long cookie = 1;

		for(int i = 0; i < k; i++) {
			if(i == k-1){
				// 最後の一回はたたくしかない
				cookie++;
			} else if(cookie >= a) {
				// 2手使ってab変換
				cookie += deff;
				i++;
			} else {
				// たたく
				cookie++;
			}
		}

		System.out.println(cookie);

	}

}
