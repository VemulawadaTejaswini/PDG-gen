import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		sc.close();
		int s = N%500;
		if(s<=A) {
			System.out.println("Yes");
			return;
		}
		System.out.println("No");

	}

}