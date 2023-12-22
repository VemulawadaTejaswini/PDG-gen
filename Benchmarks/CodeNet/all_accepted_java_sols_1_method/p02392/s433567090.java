import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int a = number.nextInt();
		int b = number.nextInt();
		int c = number.nextInt();
		if(a < b && b < c) System.out.println("Yes");
		else System.out.println("No");
	}
}
