import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int topA = 0, topC = 250000;
		int topG = 500000, topT = 750000;
		final String INSERT = "insert";
		final String FIND = "find";
		final int n = scan.nextInt();
		String[] str = new String[1000000];
		
		for (int i = 0; i < n; i++) {
			final String ord = scan.next();
			final String word = scan.next();
			
			if ( ord.equals(INSERT)) {
				switch (word.charAt(0)) {
				case 'A':
					str[topA] = word;
					topA++;
					break;
				case 'C':
					str[topC] = word;
					topC++;
					break;
				case 'G':
					str[topG] = word;
					topG++;
					break;
				case 'T':
					str[topT] = word;
					topT++;
					break;
				default:
					break;
				}
			} else if (ord.equals(FIND)) {
				switch (word.charAt(0)) {
				case 'A':
					Dictionary (str, topA, word, 0);
					break;
				case 'C':
					Dictionary (str, topC, word, 250000);
					break;
				case 'G':
					Dictionary (str, topG, word, 500000);
					break;
				case 'T':
					Dictionary (str, topT, word, 750000);
					break;
				default:
					break;
				}
			}
		}
		scan.close();
	}
	
	public static void Dictionary(String[] str, int top, String word, int n) {
		boolean flg = false;
		
		for (int j = n; j < top; j++) {
			if (word.equals(str[j])) {
				flg = true;
				break;
			}
		}
		if (flg) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
