import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	static final String OPERATOR_PLUS = "+";
	static final String OPERATOR_MINUS = "-";
	static final String OPERATOR_MULTIPLIED = "*";
	static final String OPERATOR_DIVISION = "/";
	static final String OPERATOR_END = "?";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr = null;
		int inputA;
		int inputB;
		List<Integer> calcList = new ArrayList<>();
		try {
			while (true) {
				inputStr = (input.readLine()).split(" ");
				inputA = Integer.parseInt(inputStr[0]);
				inputB = Integer.parseInt(inputStr[2]);
				
				if (Arrays.asList(inputStr).contains(OPERATOR_PLUS)) {
					calcList.add((inputA + inputB));
				} else if (Arrays.asList(inputStr).contains(OPERATOR_MINUS)) {
					calcList.add((inputA - inputB));
				} else if (Arrays.asList(inputStr).contains(OPERATOR_MULTIPLIED)) {
					calcList.add((inputA * inputB));
				} else if (Arrays.asList(inputStr).contains(OPERATOR_DIVISION)) {
					calcList.add((int)(inputA / inputB));
				} else if (Arrays.asList(inputStr).contains(OPERATOR_END)) {
					break;
				}
			}
			for (Integer i : calcList) {
				System.out.println(i);
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}

