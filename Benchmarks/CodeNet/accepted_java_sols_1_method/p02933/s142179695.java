import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String s=scan.next();
		scan.close();
		System.out.println((a<3200)? "red":s);
	}
}
