import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		//入力読み込み
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		String T = scan.next();
		//読み込み終わり
		scan.close();

		//読み込んだ文字列をchar型の配列に変換
		char[] tmpS = S.toCharArray();
		char[] tmpT = T.toCharArray();

		//SとTの文字を交互に出力
		for(int i=0;i<N;i++) {
			System.out.print(tmpS[i]);
			System.out.print(tmpT[i]);
		}
	}
}