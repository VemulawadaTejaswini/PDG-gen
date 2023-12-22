import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aStr = sc.next();
		String bStr = sc.next();
		int a = Integer.parseInt(aStr);
		int b = Integer.parseInt(bStr);
		if(a == b) {
			System.out.println("a == b");
		} else if(a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a < b");
		}
		sc.close();
	}
}