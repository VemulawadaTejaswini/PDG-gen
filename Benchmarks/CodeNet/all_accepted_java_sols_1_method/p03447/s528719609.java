import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=(x-a);
		System.out.println(c%b);

	}

}
