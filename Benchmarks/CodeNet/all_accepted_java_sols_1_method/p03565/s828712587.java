import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().replaceAll("\\?", "."); //?はエスケープ文字なので\\をつける。
														//後々の処理の関係で任意の１文字を表す.に変換
		String t = sc.next();
		int ns = s.length();
		int nt = t.length();
		//sの後ろ側nt文字を持ってくるようiを初期化、iを減らしていけば、後ろから順に一致を確かめられ、
		//初めて一致したものが辞書順で最小のものになる
		for (int i = ns - nt; i >= 0; i--) {
			String regex = s.substring(i, i + nt); //sのi~i+nt-1番目の文字列を抜き出す
			//?をワイルドカード.に置き換えているので、そこは一致しなくてもfalseにならない
			if (t.matches(regex)) {
				System.out.println(
						//s.substring(0,i)を付けるのはこの部分にregexと同じ文字列が入っていてもtに変えないようにするため
						s.replaceFirst(s.substring(0, i) + regex, s.substring(0, i) + t).replaceAll("\\.", "a"));//	sの0~i-1番目はそのまま、regexのところをtに置き換え、残りのエスケープ文字.をaに置き換え。
				return;
			}
		}
		System.out.println("UNRESTORABLE");
		sc.close();
	}

}
