import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		char[] str = sc.next().toCharArray();
		int q = sc.nextInt();
		
		for (int i = 0; i < q; i++) {
			String cmd = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();

			StringBuffer result = new StringBuffer();
			switch (cmd) {
			case "print":
				for (int j = a; j <= b; j++) {
					result.append(str[j]);
				}
				System.out.println(result);
				break;
			case "reverse":
				for (int j = a, k = b; j < k; j++, k--) {
					char temp = str[j];
					str[j] = str[k];
					str[k] = temp;
				}
				break;
			case "replace":
				char[] p = sc.next().toCharArray();
				for (int j = a, k = 0; j <= b; j++, k++) {
					str[j] = p[k];
				}
				break;
			}
		}

		sc.close();
	}
}