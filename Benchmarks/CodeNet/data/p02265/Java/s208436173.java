import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		final String NULL = "-";
		final int n = scan.nextInt();
		int count = n, top = n;
		String [] str = new String[n + 1];
		
		for (int i = 0; i < n; i++) {
			final String ord = scan.next();
			final String word;
			switch (ord) {
			case "insert":
				word = scan.next();
				str[count] = word;
				count--;
				break;
			case "delete":
				word = scan.next();
				for (int j = n; j > count; j--) {
					if (str[j] == word) {
						str[j] = NULL;
						break;
					}
				}
				break;
			case "deleteFirst":
				for (int j = count + 1; j < n; j++) {
					if (str[j].equals(NULL) == false) {
						str[j] = NULL;
						break;
					}	
				}
				break;
			case "deleteLast":
				for ( int j = n; j > count; j--) {
					if (str[j].equals(NULL) == false) {
						str[j] = NULL;
						break;
					}
				}
			break;
			default:
				break;
			}
		}
		scan.close();
		for (int i = count + 1; i <= n; i++) {
			if (str[i].equals(NULL) == false) {
				top = i;
			}
		}
		for (int i = count; i <= top; i++) {
			if (str[i].equals(NULL) == false) {
				System.out.print(str[i]);
				if (i == top) System.out.println();
				else System.out.print(" ");
			}
			
		}
	}
}
