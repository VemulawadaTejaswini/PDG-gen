import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		String result = null;
		for (int i = 0; i < n; i++) {
			String next = sc.next();
			if (result == null) {
				result = next;
			}
			if (result.compareTo(next) > 0) {
				result = next;
			}
		}

		System.out.println(result);
		
		sc.close();
	}
}