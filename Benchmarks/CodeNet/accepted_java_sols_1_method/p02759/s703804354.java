import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		boolean b = n % 2 == 0;
		System.out.println(b?n/2:n/2+1);
	}
}
