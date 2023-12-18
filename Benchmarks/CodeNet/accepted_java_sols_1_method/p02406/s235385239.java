import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		final String inputLine;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			inputLine = br.readLine();
		}

		final Integer n = Integer.valueOf(inputLine);
		List<Integer> list = new ArrayList<>();

		for(int i = 3; i <= n; i++) {
			if(i % 3 == 0) {
				list.add(i);
				continue;
			}

			int quotient = i;
			while(quotient != 0) {
				if(quotient % 10 == 3) {
					list.add(i);
					break;
				} else {
					quotient /= 10;
				}
			}
		}

		StringBuilder result = new StringBuilder();
		for(Integer i : list) {
			result.append(" " + i);
		}

		System.out.println(result);
	}
}
