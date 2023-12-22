import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		char c[] = str.toCharArray();
		c[3] = '8';
		
		System.out.println(c);
	}
}