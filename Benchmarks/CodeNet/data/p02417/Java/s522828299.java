import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		LinkedList<String> sent = new LinkedList<>();
		int[] alphaNum = new int[26];
		String[] alphaChar = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
										  "s", "t", "u", "v", "w", "x", "y", "z"};
		
		String character = sc.nextLine();
		
		for(int i = 0; i < character.length(); i++) {
			sent.add(character.substring(i, i + 1));
		}
		
		for(int i = 0; i < character.length(); i++) {
			switch(sent.get(i)) {
				case "A" :
				case "a" :
					alphaNum[0]++;
					break;
				case "B" :
				case "b" :
					alphaNum[1]++;
					break;
				case "C" :
				case "c" :
					alphaNum[2]++;
					break;
				case "D" :
				case "d" :
					alphaNum[3]++;
					break;
				case "E" :
				case "e" :
					alphaNum[4]++;
					break;
				case "F" :
				case "f" :
					alphaNum[5]++;
					break;
				case "G" :
				case "g" :
					alphaNum[6]++;
					break;
				case "H" :
				case "h" :
					alphaNum[7]++;
					break;
				case "I" :
				case "i" :
					alphaNum[8]++;
					break;
				case "J" :
				case "j" :
					alphaNum[9]++;
					break;
				case "K" :
				case "k" :
					alphaNum[10]++;
					break;
				case "L" :
				case "l" :
					alphaNum[11]++;
					break;
				case "M" :
				case "m" :
					alphaNum[12]++;
					break;
				case "N" :
				case "n" :
					alphaNum[13]++;
					break;
				case "O" :
				case "o" :
					alphaNum[14]++;
					break;
				case "P" :
				case "p" :
					alphaNum[15]++;
					break;
				case "Q" :
				case "q" :
					alphaNum[16]++;
					break;
				case "R" :
				case "r" :
					alphaNum[17]++;
					break;
				case "S" :
				case "s" :
					alphaNum[18]++;
					break;
				case "T" :
				case "t" :
					alphaNum[19]++;
					break;
				case "U" :
				case "u" :
					alphaNum[20]++;
					break;
				case "V" :
				case "v" :
					alphaNum[21]++;
					break;
				case "W" :
				case "w" :
					alphaNum[22]++;
					break;
				case "X" :
				case "x" :
					alphaNum[23]++;
					break;
				case "Y" :
				case "y" :
					alphaNum[24]++;
					break;
				case "Z" :
				case "z" :
					alphaNum[25]++;
					break;
				default :
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.println(alphaChar[i] + " : " + alphaNum[i]);
		}
	}
}