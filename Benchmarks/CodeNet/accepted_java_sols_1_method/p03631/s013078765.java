import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();
		if(N.charAt(0) == N.charAt(2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}