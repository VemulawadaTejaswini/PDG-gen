import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		boolean flag = false;
		
		String line = "";
		while (sc.hasNext() == true) {
			line = sc.nextLine();

			String bits = "";
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				
				if (Character.isAlphabetic(c) == true) {
					String tmp = Integer.toBinaryString(c - 'A');
					
					int num = tmp.length();
					for (int j = 0; j < (5 - num); j++) {
						tmp = "0" + tmp;
					}
					bits = bits + tmp;
				} else {
					switch (c) {
					case ' ':
						bits = bits + "11010";
						break;
					case '.':
						bits = bits + "11011";
						break;
					case ',':
						bits = bits + "11100";
						break;
					case '-':
						bits = bits + "11101";
						break;
					case '\'':
						bits = bits + "11110";
						break;
					case '?':
						bits = bits + "11111";
						break;
					}
				}
			}
			
			System.out.println(getChar(bits));
		}
	}
	
	public String getChar(String str) {
		String ans = "";

		String state = "";
		for (int i = 0; i < str.length(); i++) {
			String newstate = state + str.charAt(i);
			state = "";
			
			
			switch (newstate) {
			case "101":
				ans = ans + " ";
				break;
			case "000000":
				ans = ans + "'";
				break;
			case "000011":
				ans = ans + ",";
				break;
			case "10010001":
				ans = ans + "-";
				break;
			case "010001":
				ans = ans + ".";
				break;
			case "000001":
				ans = ans + "?";
				break;
			case "100101":
				ans = ans + "A";
				break;
			case "10011010":
				ans = ans + "B";
				break;
				
			case "0101":
				ans = ans + "C";
				break;
			case "0001":
				ans = ans + "D";
				break;
			case "110":
				ans = ans + "E";
				break;
			case "01001":
				ans = ans + "F";
				break;
			case "10011011":
				ans = ans + "G";
				break;
			case "010000":
				ans = ans + "H";
				break;
			case "0111":
				ans = ans + "I";
				break;
			case "10011000":
				ans = ans + "J";
				break;
				
			case "0110":
				ans = ans + "K";
				break;
			case "00100":
				ans = ans + "L";
				break;
			case "10011001":
				ans = ans + "M";
				break;
			case "10011110":
				ans = ans + "N";
				break;
			case "00101":
				ans = ans + "O";
				break;
			case "111":
				ans = ans + "P";
				break;
			case "10011111":
				ans = ans + "Q";
				break;
			case "1000":
				ans = ans + "R";
				break;
				
			case "00110":
				ans = ans + "S";
				break;
			case "00111":
				ans = ans + "T";
				break;
			case "10011100":
				ans = ans + "U";
				break;
			case "10011101":
				ans = ans + "V";
				break;
			case "000010":
				ans = ans + "W";
				break;
			case "10010010":
				ans = ans + "X";
				break;
			case "10010011":
				ans = ans + "Y";
				break;
			case "10010000":
				ans = ans + "Z";
				break;
				
			default:
				state = newstate;
				break;
			}
		}
		
		return ans;
	}
}