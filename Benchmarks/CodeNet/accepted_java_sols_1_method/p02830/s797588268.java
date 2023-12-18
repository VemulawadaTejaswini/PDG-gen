import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		String a = scanner.next();

		String b = scanner.next();

		StringBuilder sb = new StringBuilder();

		for(int i=0; i<n; i++) {
			sb.append(a.charAt(i));
			sb.append(b.charAt(i));
		}

		System.out.println(sb.toString());		

	}

}