import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int ans = 0;
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				int a = sc.nextInt();
				String b = sc.next();
				int c = sc.nextInt();
				if(b.equals("+")) {
					ans = a + c;
				}else if(b.equals("-")) {
					ans = a - c;
				}else if(b.equals("*")) {
					ans = a * c;
				}else if(b.equals("/")) {
					ans = a / c;
				}else if(b.equals("?")) {
					break;
				}
				System.out.println(ans);
			}
		}
	}
}

