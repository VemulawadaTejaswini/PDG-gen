
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	/** 処理結果 奇数 */
	static final String ODD = "Odd";
	/** 処理結果 偶数 */
	static final String EVEN = "Even";

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {

		List<Integer> arrInitString = getParameter();

		long resultCalc = arrInitString.get(0);

		for (int i = 1; i < arrInitString.size(); i++) {
			resultCalc *= arrInitString.get(i);
		}

		if (resultCalc % 2 == 0) {
			// 偶数
			outputAnswer(Main.EVEN);
		} else {
			// 奇数
			outputAnswer(Main.ODD);
		}
	}

	private List<Integer> getParameter() {

		Scanner scan = new Scanner(System.in);
		List<Integer> listInput = new ArrayList<Integer>();
		listInput.add(scan.nextInt());
		listInput.add(scan.nextInt());
		scan.close();

		return listInput;
	}

	private void outputAnswer(String answer) {
		System.out.println(answer);
	}
}
