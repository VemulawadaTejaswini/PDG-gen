import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		System.out.println((N + D * 2) / (D * 2 + 1));
	}
}	
