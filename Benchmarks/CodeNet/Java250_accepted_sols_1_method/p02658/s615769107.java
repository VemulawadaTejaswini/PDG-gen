import java.math.BigInteger;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


	    //入力数字の数を入力
		Scanner sc=new Scanner(System.in);

	    int count=sc.nextInt();

		boolean isOverflow = false;  // 桁あふれしたかフラグ
		BigInteger result=BigInteger.ZERO;
		BigInteger max=BigInteger.valueOf((long)Math.pow(10, 18));

	    //入力処理
		for(int i = 0; i < count; i++) {
			long a = sc.nextLong();

			// 桁あふれしている時は、それ以降ゼロが現れるかチェックする
			if (isOverflow) {
				// 桁あふれ後にゼロが出てきたとき
				if (a == (long)0) {
					// 求める値はゼロになる
					result = BigInteger.ZERO;
					isOverflow = false;
					break;
				}
				// 次の値を処理する
				continue;
			}

			// 積を求める
			BigInteger nyuryoku=BigInteger.valueOf(a);
			result= i==0 ? result.add(nyuryoku):result.multiply(nyuryoku);
			// 桁あふれしているか？
			if (result.compareTo(max) > 0) {
				isOverflow = true;
			}
		}

		// 結果を出力する
		if(isOverflow) {
			// 桁あふれ時は「-1」
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
	}
}
