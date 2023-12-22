import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * The Code A Doctor Loved
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		final String[] c1 = new String[128];
		c1[' '] = "101";
		c1['\''] = "000000";
		c1[','] = "000011";
		c1['-'] = "10010001";
		c1['.'] = "010001";
		c1['?'] = "000001";
		c1['A'] = "100101";
		c1['B'] = "10011010";
		c1['C'] = "0101";
		c1['D'] = "0001";
		c1['E'] = "110";
		c1['F'] = "01001";
		c1['G'] = "10011011";
		c1['H'] = "010000";
		c1['I'] = "0111";
		c1['J'] = "10011000";
		c1['K'] = "0110";
		c1['L'] = "00100";
		c1['M'] = "10011001";
		c1['N'] = "10011110";
		c1['O'] = "00101";
		c1['P'] = "111";
		c1['Q'] = "10011111";
		c1['R'] = "1000";
		c1['S'] = "00110";
		c1['T'] = "00111";
		c1['U'] = "10011100";
		c1['V'] = "10011101";
		c1['W'] = "000010";
		c1['X'] = "10010010";
		c1['Y'] = "10010011";
		c1['Z'] = "10010000";

		final HashMap<String, Character> c2 = new HashMap<String, Character>() {
			{
				put("00000", 'A');
				put("00001", 'B');
				put("00010", 'C');
				put("00011", 'D');
				put("00100", 'E');
				put("00101", 'F');
				put("00110", 'G');
				put("00111", 'H');
				put("01000", 'I');
				put("01001", 'J');
				put("01010", 'K');
				put("01011", 'L');
				put("01100", 'M');
				put("01101", 'N');
				put("01110", 'O');
				put("01111", 'P');
				put("10000", 'Q');
				put("10001", 'R');
				put("10010", 'S');
				put("10011", 'T');
				put("10100", 'U');
				put("10101", 'V');
				put("10110", 'W');
				put("10111", 'X');
				put("11000", 'Y');
				put("11001", 'Z');
				put("11010", ' ');
				put("11011", '.');
				put("11100", ',');
				put("11101", '-');
				put("11110", '\'');
				put("11111", '?');
			}
		};

		while ((line = br.readLine()) != null) {
			//
			if (line.isEmpty()) {
				System.out.println("");
				continue;
			}
			StringBuilder sb1, sb2;
			sb1 = new StringBuilder();
			sb2 = new StringBuilder();
			for (char c : line.toCharArray()) {
				sb1.append(c1[c]);
			}
			//
			sb1.append("00000");
			//
			String line2 = sb1.toString();
			for (int i = 0; i < line2.length() - 5; i += 5) {
				sb2.append(c2.get(line2.substring(i, i + 5)));
			}
			System.out.println(sb2.toString());
		}
	}
}