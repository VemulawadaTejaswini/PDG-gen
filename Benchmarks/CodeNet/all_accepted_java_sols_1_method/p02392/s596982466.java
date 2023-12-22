import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aStr = sc.next();
		String bStr = sc.next();
		String cStr = sc.next();
		int a = Integer.parseInt(aStr);
		int b = Integer.parseInt(bStr);
		int c = Integer.parseInt(cStr);
		if(a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}