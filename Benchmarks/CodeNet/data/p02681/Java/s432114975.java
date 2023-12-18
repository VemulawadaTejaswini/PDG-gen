import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		//文字数取得
		int S1 = S.length();
		//S1番目から１文字取り出す。
		String T1 = T.substring(S1-0);
		//Ｔで入力さえた値が、Ｓ+１文字と等しいか
		if(T.equals(S+T1)) {
					System.out.println("Yes");
		}else {
					System.out.println("No");
				}
		sc.close();
		 }
		}