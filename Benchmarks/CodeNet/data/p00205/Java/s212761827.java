/*
 * Rock, Paper, Scissors
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) {
				break;
			}

			int[] p = new int[5];
			int rock, scissors, paper;
			rock = scissors = paper = 0;

			p[0] = Integer.parseInt(line);
			for (int i = 1; i < 5; i++) {
				p[i] = Integer.parseInt(br.readLine());
			}
			//
			for (int i = 0; i < 5; i++) {
				switch (p[i]) {
				case 1:
					rock++;
					break;
				case 2:
					scissors++;
					break;
				case 3:
					paper++;
					break;
				}
			}
			//
			if ((rock * paper * scissors) > 0) {
				p = new int[] { 3, 3, 3, 3, 3 };
			} else if (rock == 5 || paper == 5 || scissors == 5) {
				p = new int[] { 3, 3, 3, 3, 3 };
			} else {
				if (rock == 0) {
					for (int i = 0; i < 5; i++) {
						if (p[i] == 2) {
							p[i] = 1;
						} else {
							p[i] = 2;
						}
					}
				} else if (scissors == 0) {
					for (int i = 0; i < 5; i++) {
						if (p[i] == 3) {
							p[i] = 1;
						} else {
							p[i] = 2;
						}
					}
				} else if (paper == 0) {
					for (int i = 0; i < 5; i++) {
						if (p[i] == 1) {
							p[i] = 1;
						} else {
							p[i] = 2;
						}
					}
				}
			}
			//
			for (int i = 0; i < 5; i++) {
				System.out.println(p[i]);
			}
		}
	}
}