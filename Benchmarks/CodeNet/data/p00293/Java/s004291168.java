import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Bus Timetable
 * PCK2014 ??????4
 */
public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		boolean[][] table = new boolean[24][60];

		while ((line = br.readLine()) != null & !line.isEmpty()) {
			words = line.split(" ");

			for (int i = 1; i < words.length; i += 2) {
				table[parseInt(words[i])][parseInt(words[i + 1])] = true;
			}
		}

		List<String> list = new ArrayList<>();
		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				if (table[i][j]) {
					list.add(String.format("%d:%02d", i, j));
				}
			}
		}
		System.out.println(String.join(" ", list));

	}//end main
}