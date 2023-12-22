import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a=scan.nextInt();
		System.out.println((n%500<=a?"Yes":"No"));
	}

}
