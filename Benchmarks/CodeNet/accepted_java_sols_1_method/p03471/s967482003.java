import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long y = sc.nextLong();
		String ans = "-1 -1 -1";

		y /= 1000;//全部千円のときの枚数

		//10 5 1でy/1000を作れるか
		//10を1が10枚と考える？
		//5を1が5枚
		if(n > y || n < y/10) {
			System.out.println(ans);
			return;
		}
		long nowMaisu;
		for(long toMan = 0; toMan <= y/10; toMan++) {
			for(long toGo = 0; toGo <= y/5; toGo++) {
				nowMaisu = y - 9*toMan - 4*toGo;
				if(nowMaisu==n&&n-toMan-toGo >= 0) {
					System.out.println(toMan+" "+toGo+" "+(n-toMan-toGo));
					return;
				}
			}
		}
		System.out.println(ans);
	}
}