import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String C = sc.next();
		char ans = C.charAt(0);
		System.out.println((char)(ans + 1));
	}
}