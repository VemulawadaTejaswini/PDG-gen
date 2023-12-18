import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int k = Integer.parseInt(tokens[1]);
		tokens = in.nextLine().split(" ");
		List<Integer> values = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			values.add(Integer.parseInt(tokens[i]));
		}
		Collections.sort(values);
		// 最小値と同じ値の数を出す
		int minValue = values.get(0);
		int minValueNum = 0;
		for (int i = 1; i < values.size(); ++i) {
			if (values.get(i) > minValue) {
				minValueNum = i;
				break;
			}
		}
		int result;
		if ((values.size() - minValueNum) % (k - 1) == 0) {
			result = (values.size() - minValueNum) / (k - 1);
		} else {
			result = (values.size() - minValueNum) / (k - 1) + 1;
		}
		System.out.println(result);

		in.close();

	}

}