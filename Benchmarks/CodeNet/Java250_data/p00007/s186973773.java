import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		int monthTerm = Integer.parseInt(input());

		int principal = 100000;

		while (monthTerm != 0) {
			principal += principal * 0.05;
			int fraction = principal % 1000;
			if (fraction != 0) {
				principal += 1000 - fraction;
			}
			monthTerm--;
		}

		System.out.println(principal);

	}

	private static String input() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input = null;
		try {
			input = br.readLine();
		} catch (IOException e) {
			System.out.println("読み込みに失敗しました");
			e.printStackTrace();
		}
		return input;
	}


}