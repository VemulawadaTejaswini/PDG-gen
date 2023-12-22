import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		if (x.charAt(2)==x.charAt(3)&&x.charAt(4)==x.charAt(5)) System.out.println("Yes");
		else System.out.println("No");
	}
}