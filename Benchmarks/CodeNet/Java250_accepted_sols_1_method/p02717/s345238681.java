import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		sc.close();
		int s;
		int k;
		s = X;
		X = Y;
		Y = s;
		k = X;
		X = Z;
		Z = k;
		System.out.println(X + " " + Y + " " + Z);
	}
}