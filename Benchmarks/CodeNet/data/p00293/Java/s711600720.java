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

		for (int i = 0; i < 2; i++) {
			words = br.readLine().split(" ");
			for (int j = 1; j < words.length; j += 2) {
				table[parseInt(words[j])][parseInt(words[j + 1])] = true;
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