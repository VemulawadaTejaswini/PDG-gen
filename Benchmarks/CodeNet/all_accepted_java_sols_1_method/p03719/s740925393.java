import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		if(C >= A && C <= B) System.out.println("Yes");
		else System.out.println("No");
	}
}
