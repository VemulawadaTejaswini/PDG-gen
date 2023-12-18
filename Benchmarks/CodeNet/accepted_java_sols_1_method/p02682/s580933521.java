import java.util.Scanner;
public class Main {
	public static void main (String[] args) {

//	パターン1（Aから順番に使って足していく）
//	変数を読み込む
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int total = 0;  //合計を入れる変数

//	Aから順に、合計K枚になるまで足していく
		if(A >= K) {  //A>KならKの数を表示で終了
			total = K;
			System.out.println(total);
			return;
		}
		else {  //A＜Kの場合は続く
			total = A;
		}
      
//	BがK-A枚より多いか少ないかで判断
		if(B < K-A) {  //B<=K-AならK-A-Bの数分-1をする
			total -= K-A-B;
			System.out.println(total);
		}
		else {  //B>K-Aならそのまま表示
			System.out.println(total);
		}
	}
}