import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		List<Map<Integer, Integer>> list = new ArrayList<>();
		Map<Integer, Integer> map = new LinkedHashMap<>();
		while(true) {
			if ((map = checkZero(input.readLine())) == null) {
			  break;
			} else {
			  list.add(map);
			}
		}
		for (Map<Integer, Integer> resultMap : list) {
			for (Map.Entry<Integer, Integer> entry: resultMap.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}

	}

	public static Map<Integer, Integer> checkZero(String readLine) {
		Map<Integer, Integer> checkZeroResult = new LinkedHashMap<>();

		String[] inputStr = readLine.split(" ");
		int[] inputInt = new int[inputStr.length];
		for (int i = 0; i < inputInt.length; i++) {
			inputInt[i] = Integer.parseInt(inputStr[i]);
		}
		// input number is both zero
		if (inputInt[0] == 0 && inputInt[1] == 0 ) {
			checkZeroResult = null;
		// other
		} else {
			// compare input number
			if (inputInt[0] > inputInt[1]) {
			  checkZeroResult.put(inputInt[1], inputInt[0]);
			} else {
			  checkZeroResult.put(inputInt[0], inputInt[1]);
			}
		}
		return checkZeroResult;
	}

}

