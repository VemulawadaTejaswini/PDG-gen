import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer inputNum = Integer.valueOf(br.toString());
		System.out.print(inputNum + " :");
		List<Integer> list = new ArrayList<>();

		for (int i = 2; i * i <= inputNum; i++) {
			while (inputNum % i == 0) {
				inputNum = inputNum / i;
				list.add(i);
			}
		}
		if (inputNum > 1) {
			list.add(inputNum);
		}
		Collections.sort(list);

		for (int prime : list) {
			System.out.print(" " + prime);
		}
		br.close();
	}
}