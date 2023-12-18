import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = N%1000;
		if(X ==  0) {
			X = 1000;
		}
		System.out.println(1000-X);
		sc.close();
	}
}
