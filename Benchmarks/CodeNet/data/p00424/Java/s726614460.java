import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
		char table[] = new char['z' + 1];
		int n, ln;
		
		for (char i = 0; i <= 'z'; i++) {
			table[i] = i;
		}
		
		n = scanner.nextInt();
		while (n != 0) {
			str.setLength(0);
			
			for(int i = 0; i < n; i++) {
				char fromChar = scanner.next().toCharArray()[0];
				char toChar = scanner.next().toCharArray()[0];
				table[fromChar] = toChar;
			}

			ln = scanner.nextInt();
			
			for(int i = 0; i < ln; i++) {
				char inputChar = scanner.next().toCharArray()[0];
				str.append(table[inputChar]);
			}
			
			System.out.println(str.toString());
			n = scanner.nextInt();
		}
	}
}