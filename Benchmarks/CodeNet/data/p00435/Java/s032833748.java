import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String string;
		String string2 = "";

		string = scanner.next();
		for (int i = 0; i < string.length(); i++) {
			switch (string.charAt(i)) {
			case 'A':	string2 += "X";	break;
			case 'B':	string2 += "Y";	break;
			case 'C':	string2 += "Z";	break;
			case 'D':	string2 += "A";	break;
			case 'E':	string2 += "B";	break;
			case 'F':	string2 += "C";	break;
			case 'G':	string2 += "D";	break;
			case 'H':	string2 += "E";	break;
			case 'I':	string2 += "F";	break;
			case 'J':	string2 += "G";	break;
			case 'K':	string2 += "H";	break;
			case 'L':	string2 += "I";	break;
			case 'M':	string2 += "J";	break;
			case 'N':	string2 += "K";	break;
			case 'O':	string2 += "L";	break;
			case 'P':	string2 += "M";	break;
			case 'Q':	string2 += "N";	break;
			case 'R':	string2 += "O";	break;
			case 'S':	string2 += "P";	break;
			case 'T':	string2 += "Q";	break;
			case 'U':	string2 += "R";	break;
			case 'V':	string2 += "S";	break;
			case 'W':	string2 += "T";	break;
			case 'X':	string2 += "U";	break;
			case 'Y':	string2 += "V";	break;
			case 'Z':	string2 += "W";	break;
			default:	break;
			}
		}
		System.out.println(string2);
	}
}