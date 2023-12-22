import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		if(X > B) System.out.println("delicious");
		else if(X >= B-A) System.out.println("safe");
		else System.out.println("dangerous");
	}
}
