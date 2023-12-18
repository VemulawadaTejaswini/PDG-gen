import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

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

		int N = Integer.parseInt(inputs.pop());
		int M = Integer.parseInt(inputs.pop());
		int K = Integer.parseInt(inputs.pop());
		
		ArrayDeque<Integer> aTable = new ArrayDeque<>(); 
		ArrayDeque<Integer> bTable = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			aTable.add(Integer.parseInt(inputs.poll()));
		}
		for (int i = 0; i < M; i++) {
			bTable.add(Integer.parseInt(inputs.poll()));
		}
		
		int result = 0;
		do {
			boolean isRead = false;
			if (aTable.size() > 0 && (bTable.size() == 0 || aTable.getFirst() <= bTable.getFirst())) {
				K -= aTable.poll();
				isRead = true;
			} else if (bTable.size() > 0) {
				K -= bTable.poll();
				isRead = true;
			}
			
			if (isRead && K >= 0) {
				result++;
			}
		} while (K > 0);
		
		System.out.println(result);
	}
}
