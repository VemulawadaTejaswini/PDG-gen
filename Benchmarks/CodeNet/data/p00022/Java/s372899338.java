import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		while (input.ready()) {
			int setCount = Integer.valueOf(input.readLine());
			if (setCount == 0)
				break;
			ArrayList<Integer> dataSet = new ArrayList<>();
			for (int i = 0; i < setCount; i++) {
				dataSet.add(Integer.valueOf(input.readLine()));
			}
			ArrayList<Integer> ansSet = new ArrayList<>();
			for (int i = 0; i < setCount; i++) {
				int tmp = 0;
				for (int j = i; j < setCount; j++) {
					tmp += dataSet.get(j);
					ansSet.add(tmp);
				}
			}
			Collections.sort(ansSet);
			System.out.println(ansSet.get(ansSet.size()-1));
		}
	}
}