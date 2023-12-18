import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Listに標準入力の値を取得
		ArrayDeque<String> inputs = new ArrayDeque<>();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			while (br.ready()) {
				String[] lineArray = br.readLine().split(" ");
				Arrays.<String> stream(lineArray).forEach(s -> inputs.add(s.trim()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 入力取得
		String s = inputs.pop();
		Integer n = Integer.parseInt(inputs.pop());
		
		List<Integer> list = new ArrayList<>();
		for (String str : inputs) {
			int num = Integer.parseInt(str);
			list.add(num);
		}
		Collections.sort(list);

		int result = 0;
		for (int i = 0; i < n; i++) {
			Integer base = list.get(i);
			result += base;
		}

		System.out.println(result);
	}
}
