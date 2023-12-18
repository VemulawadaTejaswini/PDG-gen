import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		//処理
		if(a == 1) a += 13;
		if(b == 1) b += 13;
		String ans = "Draw";
		if(a > b) ans = "Alice";
		if(b > a) ans = "Bob";

		//出力
		System.out.println(ans);
	}
}
