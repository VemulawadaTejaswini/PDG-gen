import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String sr = sc.nextLine();//文字列入力
		char[] ch = sr.toCharArray();//文字単位でリスト化
		for (int i = 0; i < ch.length; ++i) {//繰り返し
			if (Character.isUpperCase(ch[i])) {//大文字か判断
				ch[i] = Character.toLowerCase(ch[i]);//上の判定で大文字なら小文字にする
			} else {
				ch[i] = Character.toUpperCase(ch[i]);//違うのなら大文字にする
			}
		}
		StringBuffer sb = new StringBuffer(new String(ch));//StringBufferからStringへキャスト
		System.out.println(sb.toString());//出力時に文字列に変換

	}

}

