import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();

		//処理
		long base = 2 * (x/11);
		if(x - base / 2 * 11 > 0) base++;
		if(x - base / 2 * 11 > 6) base++;

		//出力
		System.out.println(base);
	}
}
