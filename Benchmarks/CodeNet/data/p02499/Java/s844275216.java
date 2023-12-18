import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int[] alpha = new int['z' - 'a' + 1];
		
		StringBuffer line;
		for (; sc.hasNextLine();) {
			line = new StringBuffer(sc.nextLine());
			for (int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);
				if (ch >= 'a' && ch <= 'z') {
					alpha[ch - 'a']++;
				} else if (ch >= 'A' && ch <= 'Z') {
					alpha[ch - 'A']++;
				}
			}
		}
		
		for (int i = 0; i < 'z' - 'a' + 1; i++) {
			StringBuffer result = new StringBuffer();
			result.append((char)(i + 'a'));
			result.append(" : ");
			result.append(alpha[i]);
			System.out.println(result);
		}
		
		sc.close();
	}
}