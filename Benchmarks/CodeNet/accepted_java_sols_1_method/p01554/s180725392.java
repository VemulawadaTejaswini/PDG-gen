import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] registerdUsers = new String[256];
		String[] acsessUsers = new String[256];
		boolean isOpen = false;

		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			registerdUsers[i] = scan.next();
		}

		int m = scan.nextInt();
		for(int i = 0; i < m; i++) {
			acsessUsers[i] = scan.next();
		}

		scan.close();
		boolean flag = false;

		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(acsessUsers[i].equals(registerdUsers[j])) {
					if(isOpen) {
						System.out.println("Closed by " + acsessUsers[i]);
						isOpen = false;
						flag = true;
						break;
					}else {
						System.out.println("Opened by " + acsessUsers[i]);
						isOpen = true;
						flag = true;
						break;
					}
				}
			}
			if(!flag) {
				System.out.println("Unknown " + acsessUsers[i]);
			}
			flag = false;
		}
	}
}
