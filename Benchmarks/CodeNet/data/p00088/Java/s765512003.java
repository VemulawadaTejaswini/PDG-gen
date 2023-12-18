import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String ans = "";
		String tmp = "";
		while (sc.hasNextLine()) {
			String nico = sc.nextLine();
			
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
				
				if (tmp.length() >= 5) {
					switch (tmp.substring(0, 5)) {
					case "00000":
						ans = ans + 'A';
						break;
					case "00001":
						ans = ans + 'B';
						break;
					case "00010":
						ans = ans + 'C';
						break;
					case "00011":
						ans = ans + 'D';
						break;
					case "00100":
						ans = ans + 'E';
						break;
					case "00101":
						ans = ans + 'F';
						break;
					case "00110":
						ans = ans + 'G';
						break;
					case "00111":
						ans = ans + 'H';
						break;
					case "01000":
						ans = ans + 'I';
						break;
					case "01001":
						ans = ans + 'J';
						break;
					case "01010":
						ans = ans + 'K';
						break;
					case "01011":
						ans = ans + 'L';
						break;
					case "01100":
						ans = ans + 'M';
						break;
					case "01101":
						ans = ans + 'N';
						break;
					case "01110":
						ans = ans + 'O';
						break;
					case "01111":
						ans = ans + 'P';
						break;
					case "10000":
						ans = ans + 'Q';
						break;
					case "10001":
						ans = ans + 'R';
						break;
					case "10010":
						ans = ans + 'S';
						break;
					case "10011":
						ans = ans + 'T';
						break;
					case "10100":
						ans = ans + 'U';
						break;
					case "10101":
						ans = ans + 'V';
						break;
					case "10110":
						ans = ans + 'W';
						break;
					case "10111":
						ans = ans + 'X';
						break;
					case "11000":
						ans = ans + 'Y';
						break;
					case "11001":
						ans = ans + 'Z';
						break;
					case "11010":
						ans = ans + ' ';
						break;
					case "11011":
						ans = ans + '.';
						break;
					case "11100":
						ans = ans + ',';
						break;
					case "11101":
						ans = ans + '-';
						break;
					case "11110":
						ans = ans + '\'';
						break;
					case "11111":
						ans = ans + '?';
						break;
					}
					tmp = tmp.substring(5);
				}
			}
			System.out.println(ans);
		}
	}
}