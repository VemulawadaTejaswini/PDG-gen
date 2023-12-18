import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String nico = sc.nextLine();
			
			String ans = "";
			String tmp = "";
			for (int i = 0; i < nico.length(); i++) {
				switch (nico.charAt(i)) {
				case ' ' :
					tmp = tmp + "101";
					break;
				case '\'':
					tmp = tmp + "000000";
					break;
				case ',':
					tmp = tmp + "000011";
					break;
				case '-':
					tmp = tmp + "10010001";
					break;
				case '.':
					tmp = tmp + "010001";
					break;
				case '?':
					tmp = tmp + "000001";
					break;
				case 'A':
					tmp = tmp + "100101";
					break;
				case 'B':
					tmp = tmp + "10011010";
					break;
				case 'C':
					tmp = tmp + "0101";
					break;
				case 'D':
					tmp = tmp + "0001";
					break;
				case 'E':
					tmp = tmp + "110";
					break;
				case 'F':
					tmp = tmp + "01001";
					break;
				case 'G':
					tmp = tmp + "10011011";
					break;
				case 'H':
					tmp = tmp + "010000";
					break;
				case 'I':
					tmp = tmp + "0111";
					break;
				case 'J':
					tmp = tmp + "10011000";
					break;
				case 'K':
					tmp = tmp + "0110";
					break;
				case 'L':
					tmp = tmp + "00100";
					break;
				case 'M':
					tmp = tmp + "10011001";
					break;
				case 'N':
					tmp = tmp + "10011110";
					break;
				case 'O':
					tmp = tmp + "00101";
					break;
				case 'P':
					tmp = tmp + "111";
					break;
				case 'Q':
					tmp = tmp + "10011111";
					break;
				case 'R':
					tmp = tmp + "1000";
					break;
				case 'S':
					tmp = tmp + "00110";
					break;
				case 'T':
					tmp = tmp + "00111";
					break;
				case 'U':
					tmp = tmp + "10011100";
					break;
				case 'V':
					tmp = tmp + "10011101";
					break;
				case 'W':
					tmp = tmp + "000010";
					break;
				case 'X':
					tmp = tmp + "10010010";
					break;
				case 'Y':
					tmp = tmp + "10010011";
					break;
				case 'Z':
					tmp = tmp + "10010000";
					break;
				}
				
				while (tmp.length() >= 5) {
					ans = ans + getChar(tmp.substring(0, 5));
					tmp = tmp.substring(5);
				}
			}

			if (tmp.length() != 0) {
				int lim = 5 - tmp.length();
				for (int i = 0; i < lim; i++) {
					tmp = tmp + "0";
				}
				ans = ans + getChar(tmp);
			}
			System.out.println(ans);
		}
	}
	
	private char getChar(String str) {
		switch (str) {
		case "00000":
			return 'A';
		case "00001":
			return 'B';
		case "00010":
			return 'C';
		case "00011":
			return 'D';
		case "00100":
			return 'E';
		case "00101":
			return 'F';
		case "00110":
			return 'G';
		case "00111":
			return 'H';
		case "01000":
			return 'I';
		case "01001":
			return 'J';
		case "01010":
			return 'K';
		case "01011":
			return 'L';
		case "01100":
			return 'M';
		case "01101":
			return 'N';
		case "01110":
			return 'O';
		case "01111":
			return 'P';
		case "10000":
			return 'Q';
		case "10001":
			return 'R';
		case "10010":
			return 'S';
		case "10011":
			return 'T';
		case "10100":
			return 'U';
		case "10101":
			return 'V';
		case "10110":
			return 'W';
		case "10111":
			return 'X';
		case "11000":
			return 'Y';
		case "11001":
			return 'Z';
		case "11010":
			return ' ';
		case "11011":
			return '.';
		case "11100":
			return ',';
		case "11101":
			return '-';
		case "11110":
			return '\'';
		case "11111":
			return '?';
		}
		
		return 0;
	}
}