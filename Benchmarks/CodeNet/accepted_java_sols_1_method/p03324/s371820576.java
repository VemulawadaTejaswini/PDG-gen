import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		int d = scanner.nextInt();
		int n = scanner.nextInt();
		if(n == 100) {
			n++;
		}
		System.out.println((int)Math.pow(100, d) * n);			

	}

}
