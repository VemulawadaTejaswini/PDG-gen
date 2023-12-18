import java.math.BigInteger;
import java.util.*;
public class Main {
	//模範解答の理解度確認
	static public HashMap<Long, BigInteger> memo = new HashMap<Long, BigInteger>();
	static public long a, b, c, d;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int x = sc.nextInt();

		// 出力
		System.out.println(360/x);
		sc.close();
	}
}
