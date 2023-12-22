import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] alphabet = new int[26];
		char a = 'a', ch;
		while (sc.hasNext()) {
			String str = sc.next().toLowerCase();
			for (int i=0; i< str.length(); i++) {
				if (Character.isLetter(ch = str.charAt(i))) {
					alphabet[ch - a]++;
				}
			}
		}
		sc.close();
		for (int i=0; i <= ('z' - 'a'); i++) {
			System.out.println(new StringBuilder().append(a++).append(" : ").append(alphabet[i]).toString());
		}
	}
}