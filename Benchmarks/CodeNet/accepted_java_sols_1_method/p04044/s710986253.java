import java.util.Arrays;
import java.util.Scanner;

public class Main{
	/*
	 * 問題文 いろはちゃんは 長さ L の文字列を N 個持っており、それぞれ S1,S2,…,SN です。
	 *
	 * それらの文字列を好きな順番で全て結合してできる文字列のうち、もっとも辞書順で小さいものを求めてください。
	 *
	 * なお、ある文字列 s=s1s2s3...sn と t=t1t2t3...tm について、以下のどちらかを満たすとき、
	 * 辞書順比較で s<t
	 * であるといいます。
	 *
	 * ある整数 i(1≦i≦min(n,m)) に関して、 1≦j<i を満たす任意の整数 j において sj=tj が成立し、
	 * かつ si<ti
	 * が成立する。 任意の整数 i(1≦i≦min(n,m)) に関して si=ti が成立し、かつ n<m が成立する
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.next();

		}
		Arrays.sort(str);//昇順でならびかえる
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
		}
	}

}