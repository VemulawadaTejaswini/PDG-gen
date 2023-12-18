import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		scan.close();
		
		// 0がaになり、1大きい数が渡されるけど、アルファベットだけの26進数にしてね
		System.out.println(convertOriginalShinsuStr(n, 'a', 1, 26));
		
	}
	
	/**
	 * 10進数をオリジナル進数(アルファベット)文字列に変換
	 * @param dNum 変換する10進数
	 * @param origin 10進数の0をオリジナル進数で変換した後の文字
	 * @param offset オリジナル変数の0に何を足せば10進数の0になるか？
	 * @param baseNumber 何進数に変換するの
	 * @return オリジナル進数(アルファベット)文字列
	 */
	public static String convertOriginalShinsuStr(
			long dNum, final char origin, final int offset, final int baseNumber) {
		
		// よくわからんワンちゃん
		if(dNum <= 0) {
			return "";
		}
		
		// 邪魔なのでオフセットは消化
		dNum -= offset;
		
		// char型とintの足し算で文字を求める
		String ret = String.valueOf((char)(origin + dNum % baseNumber));
		// 小数点以下は切り捨てられる
		dNum /= baseNumber ; 
		
		// 次の位も頼みます
		return convertOriginalShinsuStr(dNum, origin, offset, baseNumber) + ret;
		
	}

}
