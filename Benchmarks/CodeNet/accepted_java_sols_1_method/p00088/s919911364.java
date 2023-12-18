import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Character, String> map = new HashMap<Character, String>();
		map.put(' ', "101");
		map.put('\'', "000000");
		map.put(',', "000011");
		map.put('-', "10010001");
		map.put('.', "010001");
		map.put('?', "000001");
		map.put('A', "100101");
		map.put('B', "10011010");
		map.put('C', "0101");
		map.put('D', "0001");
		map.put('E', "110");
		map.put('F', "01001");
		map.put('G', "10011011");
		map.put('H', "010000");
		map.put('I', "0111");
		map.put('J', "10011000");
		map.put('K', "0110");
		map.put('L', "00100");
		map.put('M', "10011001");
		map.put('N', "10011110");
		map.put('O', "00101");
		map.put('P', "111");
		map.put('Q', "10011111");
		map.put('R', "1000");
		map.put('S', "00110");
		map.put('T', "00111");
		map.put('U', "10011100");
		map.put('V', "10011101");
		map.put('W', "000010");
		map.put('X', "10010010");
		map.put('Y', "10010011");
		map.put('Z', "10010000");
		HashMap<String, Character> map2 = new HashMap<String, Character>();

		map2.put("00000", 'A');
		map2.put("00001", 'B');
		map2.put("00010", 'C');
		map2.put("00011", 'D');
		map2.put("00100", 'E');
		map2.put("00101", 'F');
		map2.put("00110", 'G');
		map2.put("00111", 'H');
		map2.put("01000", 'I');
		map2.put("01001", 'J');
		map2.put("01010", 'K');
		map2.put("01011", 'L');
		map2.put("01100", 'M');
		map2.put("01101", 'N');
		map2.put("01110", 'O');
		map2.put("01111", 'P');
		map2.put("10000", 'Q');
		map2.put("10001", 'R');
		map2.put("10010", 'S');
		map2.put("10011", 'T');
		map2.put("10100", 'U');
		map2.put("10101", 'V');
		map2.put("10110", 'W');
		map2.put("10111", 'X');
		map2.put("11000", 'Y');
		map2.put("11001", 'Z');
		map2.put("11010", ' ');
		map2.put("11011", '.');
		map2.put("11100", ',');
		map2.put("11101", '-');
		map2.put("11110", '\'');
		map2.put("11111", '?');
		StringBuilder sb = new StringBuilder();
		for (Scanner in = new Scanner(System.in); in.hasNextLine();) {
			sb.setLength(0);
			char[] cs = in.nextLine().toCharArray();
			for (char c : cs) {
				sb.append(map.get(c));
			}
			while (sb.length() % 5 != 0) {
				sb.append('0');
			}
			String s = sb.toString();
			for (int i = 0; i < s.length(); i += 5) {
				System.out.print(map2.get(s.subSequence(i, i + 5)));
			}
			System.out.println();
		}
	}
}