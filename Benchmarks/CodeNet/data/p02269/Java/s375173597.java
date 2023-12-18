import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] top = {0, 250000, 500000, 750000};
		final int[] head = {0, 250000, 500000, 750000};
		final String INSERT = "insert";
		final String FIND = "find";
		final char A = 'A', C = 'C', G = 'G', T = 'T';
		final int n = scan.nextInt();
		String[] str = new String[1000000];
		
		for (int i = 0; i < n; i++) {
			final String ord = scan.next();
			final String word = scan.next();
			
			if ( ord.equals(INSERT)) {
				switch (word.charAt(0)) {
				case A:
					str[top[0]] = word;
					top[0]++;
					break;
				case C:
					str[top[1]] = word;
					top[1]++;
					break;
				case G:
					str[top[2]] = word;
					top[2]++;
					break;
				case T:
					str[top[3]] = word;
					top[3]++;
					break;
				default:
					break;
				}
			} else if (ord.equals(FIND)) {
				switch (word.charAt(0)) {
				case A:
					Dictionary (str, top[0], word, head[0]);
					break;
				case C:
					Dictionary (str, top[1], word, head[1]);
					break;
				case G:
					Dictionary (str, top[2], word, head[2]);
					break;
				case T:
					Dictionary (str, top[3], word, head[3]);
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
