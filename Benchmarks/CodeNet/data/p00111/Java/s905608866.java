/**
 * Doctor's Memorable Codes
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	static final HashMap<Character, String> c1 = new HashMap<Character, String>(32) {
		{
			put('A', "00000");
			put('B', "00001");
			put('C', "00010");
			put('D', "00011");
			put('E', "00100");
			put('F', "00101");
			put('G', "00110");
			put('H', "00111");
			put('I', "01000");
			put('J', "01001");
			put('K', "01010");
			put('L', "01011");
			put('M', "01100");
			put('N', "01101");
			put('O', "01110");
			put('P', "01111");
			put('Q', "10000");
			put('R', "10001");
			put('S', "10010");
			put('T', "10011");
			put('U', "10100");
			put('V', "10101");
			put('W', "10110");
			put('X', "10111");
			put('Y', "11000");
			put('Z', "11001");
			put(' ', "11010");
			put('.', "11011");
			put(',', "11100");
			put('-', "11101");
			put('\'', "11110");
			put('?', "11111");
		}
	};

	static final HashMap<String, Character> c2 = new HashMap<String, Character>(32) {
		{
			put("101", ' ');
			put("000000", '\'');
			put("000011", ',');
			put("10010001", '-');
			put("010001", '.');
			put("000001", '?');
			put("100101", 'A');
			put("10011010", 'B');
			put("0101", 'C');
			put("0001", 'D');
			put("110", 'E');
			put("01001", 'F');
			put("10011011", 'G');
			put("010000", 'H');
			put("0111", 'I');
			put("10011000", 'J');
			put("0110", 'K');
			put("00100", 'L');
			put("10011001", 'M');
			put("10011110", 'N');
			put("00101", 'O');
			put("111", 'P');
			put("10011111", 'Q');
			put("1000", 'R');
			put("00110", 'S');
			put("00111", 'T');
			put("10011100", 'U');
			put("10011101", 'V');
			put("000010", 'W');
			put("10010010", 'X');
			put("10010011", 'Y');
			put("10010000", 'Z');
		}
	};

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			if (line.isEmpty()) {
				System.out.println("");
				continue;
			}

			StringBuilder sb1, sb2;
			sb1 = new StringBuilder();
			sb2 = new StringBuilder();
			for (char c : line.toCharArray()) {
				sb1.append(c1.get(c));
			}
			//
			String line2 = sb1.toString();
			for (int i = 0; ; ) {
				char c = 0;
				for (int j = 3; j < 9 && i + j < line2.length(); j++) {
					if (i + j < line2.length()) {
						if (c2.containsKey(line2.substring(i, i + j))) {
							c = c2.get(line2.substring(i, i + j));
							sb2.append(c);
							i += j;
							break;
						}
					} else {
						if (c2.containsKey(line2.substring(i))) {
							c = c2.get(line2.substring(i));
							sb2.append(c);
							break;
						}
					}
				}
				if (c == 0) {
					break;
				}
			}
			System.out.println(sb2.toString());
		}
	}
}