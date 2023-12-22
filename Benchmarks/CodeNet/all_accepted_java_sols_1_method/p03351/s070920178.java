import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if(Math.abs(A-C)<=D||(Math.abs(A-B)<=D&&Math.abs(B-C)<=D)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}