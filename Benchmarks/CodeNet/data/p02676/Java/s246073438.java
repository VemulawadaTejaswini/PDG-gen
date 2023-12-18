import java.util.*;
public class Main {
	public static void main(String[] args){
    //標準入力のインスタンス作成
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int K = sc.nextInt();
		String S = sc.next();
		// 出力
		if( S.length() <= K ){
			System.out.println(S);
		}else{
			System.out.println(S.substring(0,K)+"...");
		}
	}
}
