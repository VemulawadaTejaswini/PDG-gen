import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s, str;

		s = sc.nextLine();
		str = "";
		for (int i = 0; i < s.length(); i++) {
			str += charToBin(s.charAt(i));
		}
		System.out.println(str);
		for (int i = 0; i < str.length(); i += 5) {
			System.out.print((char)binToChar(str, i));
		}
		System.out.println();
	}

	public static String charToBin(char c) {
		String s = "";
		if (c == ' ') {
			s = "101";
		} else if (c == '\'') {
			s = "000000";
		} else if (c == ',') {
			s = "000011";
		} else if (c == '-') {
			s = "10010001";
		} else if (c == '.') {
			s = "010001";
		} else if (c == '?') {
			s = "000001";
		} else if (c == 'A') {
			s = "100101";
		} else if (c == 'B') {
			s = "10011010";
		} else if (c == 'C') {
			s = "0101";
		} else if (c == 'D') {
			s = "0001";
		} else if (c == 'E') {
			s = "110";
		} else if (c == 'F') {
			s = "01001";
		} else if (c == 'G') {
			s = "10011011";
		} else if (c == 'H') {
			s = "010000";
		} else if (c == 'I') {
			s = "0111";
		} else if (c == 'J') {
			s = "10011000";
		} else if (c == 'K') {
			s = "0110";
		} else if (c == 'L') {
			s = "00100";
		} else if (c == 'M') {
			s = "10011001";
		} else if (c == 'N') {
			s = "10011110";
		} else if (c == 'O') {
			s = "00101";
		} else if (c == 'P') {
			s = "111";
		} else if (c == 'Q') {
			s = "10011111";
		} else if (c == 'R') {
			s = "1000";
		} else if (c == 'S') {
			s = "00110";
		} else if (c == 'T') {
			s = "00111";
		} else if (c == 'U') {
			s = "10011100";
		} else if (c == 'V') {
			s = "10011101";
		} else if (c == 'W') {
			s = "000010";
		} else if (c == 'X') {
			s = "10010010";
		} else if (c == 'Y') {
			s = "10010011";
		} else if (c == 'Z') {
			s = "10010000";
		}
		return s;
	}

	public static char binToChar(String s, int i) {
		int a = 0;
		char c = 0;
		a += (s.charAt(i) - '0') * 10000;
		if (i + 1 < s.length() - 1) {
			a += (s.charAt(i + 1) - '0') * 1000;
			if (i + 2 < s.length() - 1) {
				a += (s.charAt(i + 2) - '0') * 100;
				if (i + 3 < s.length() - 1) {
					a += (s.charAt(i + 3) - '0') * 10;
					if (i + 4 < s.length() - 1) {
						a += (s.charAt(i + 4) - '0') * 1;
					}
				}
			}
		}

		if (a == 0) {
			c = 'A';
		} else if (a == 1) {
			c = 'B';
		} else if (a == 10) {
			c = 'C';
		} else if (a == 11) {
			c = 'D';
		} else if (a == 100) {
			c = 'E';
		} else if (a == 101) {
			c = 'F';
		} else if (a == 110) {
			c = 'G';
		} else if (a == 111) {
			c = 'H';
		} else if (a == 1000) {
			c = 'I';
		} else if (a == 1001) {
			c = 'J';
		} else if (a == 1010) {
			c = 'K';
		} else if (a == 1011) {
			c = 'L';
		} else if (a == 1100) {
			c = 'M';
		} else if (a == 1101) {
			c = 'N';
		} else if (a == 1110) {
			c = 'O';
		} else if (a == 1111) {
			c = 'P';
		} else if (a == 10000) {
			c = 'Q';
		} else if (a == 10001) {
			c = 'R';
		} else if (a == 10010) {
			c = 'S';
		} else if (a == 10011) {
			c = 'T';
		} else if (a == 10100) {
			c = 'U';
		} else if (a == 10101) {
			c = 'V';
		} else if (a == 10110) {
			c = 'W';
		} else if (a == 10111) {
			c = 'X';
		} else if (a == 11000) {
			c = 'Y';
		} else if (a == 11001) {
			c = 'Z';
		} else if (a == 11010) {
			c = ' ';
		} else if (a == 11011) {
			c = '.';
		} else if (a == 11100) {
			c = ',';
		} else if (a == 11101) {
			c = '-';
		} else if (a == 11110) {
			c = '\'';
		} else if (a == 11111) {
			c = '?';
		}
		return c;
	}
}