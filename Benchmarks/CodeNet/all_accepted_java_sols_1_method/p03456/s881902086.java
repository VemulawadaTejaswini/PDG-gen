import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		double ab = Math.sqrt(Integer.parseInt(a + b));
		System.out.println((int)ab == ab? "Yes": "No");
	}
}