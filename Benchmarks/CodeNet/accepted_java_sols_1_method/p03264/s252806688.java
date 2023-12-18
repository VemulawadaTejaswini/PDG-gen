import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		scan.close();
		System.out.println((k%2==0)? (k/2)*(k/2):(k/2+1)*(k/2));
	}
}