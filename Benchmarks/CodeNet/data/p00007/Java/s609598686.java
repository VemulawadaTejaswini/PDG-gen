import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class DebtHell {

	/** 元金 */
	static final BigDecimal capital = BigDecimal.valueOf(100000);

	/** 利子 */
	static final BigDecimal interest = BigDecimal.valueOf(0.05);

	/** 率 */
	static final BigDecimal rate = BigDecimal.valueOf(1).add(interest);

	/**
	 * プログラミングコンテスト
	 * 初級編：Debt Hell(借金地獄)
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String input = br.readLine();

		// ユーザに入力：何週間後の借金を出力するのか
		int weeks = Integer.valueOf(input);

		// 計算結果の初期値に元金を格納
		BigDecimal result = capital;
		for (int i = 0; i < weeks; i++) {
			// 利子を考慮した率をかけ、1000円未満を切り上げる
			result = roundUpLowerThousand(rate.multiply(result).setScale(0, BigDecimal.ROUND_UP));
		}

		System.out.println(result);
	}

	/**
	 * 対称の数値の1000未満を切り上げをして返却
	 *
	 * @param target 対称数値
	 * @return 切り上げした結果
	 */
	private static BigDecimal roundUpLowerThousand(BigDecimal target) {
		// 計算に使用する基準数（1000）
		BigDecimal basisNumber = BigDecimal.valueOf(1000);
		BigDecimal result = target.divide(basisNumber).setScale(0, BigDecimal.ROUND_UP);

		return result.multiply(basisNumber);
	}
}