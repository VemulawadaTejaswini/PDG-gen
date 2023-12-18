import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int count;
		String [] str = new String[n + 1];
		String word, ord;
		
		for (int i = 0; i < n; i++) {
			ord = scan.next();
			count = 0;
			switch (ord) {
			case "insert":
				count++;
				word = scan.next();
				str[count] = word;
				break;
			case "delete":
				word = scan.next();
				for (int j = 1; j < count; j++) {
					if (str[j] == word) {
						str[j] = null;
						break;
					}
				}
				break;
			case "deleteFirst":
				for (int j = 1; j < count; j++) {
					if (str[j] != null) {
						str[j] = null;
						break;
					}
				}
				break;
			case "deleteLast":
				for ( int j = count; j > 1; j--) {
					if (str[j] != null) {
						str[j] = null;
						break;
					}
				}
			break;
			default:
				break;
			}
		}
		scan.close();
		for (int i = n; i > 1; i--) {
			if (str[i] != null) {
				System.out.print(str[i] + " ");
			}
		}
	}
}

