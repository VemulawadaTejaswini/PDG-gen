import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

//	パターン1（SとKを比べて場合分け）
//	入力の読み込み
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();
		if(S.length() <= K) {
			System.out.print(S);
		}
		else {
			System.out.print(S.substring(0,K) + "...");
		}



//	パターン2（Kまで1文字ずつ表示）
//		for(int i=0 ; i<K ; i++) {
//			System.out.print(S.charAt(i));
//		}
//		System.out.print("...");
	
	}
}
