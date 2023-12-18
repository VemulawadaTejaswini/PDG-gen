import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();

		int x = X;
		int y = Y;
		int z = Z;

		X = y;
		Y = x;
		X = z;
		Z = y;

		System.out.print(X);
		System.out.print(" ");
		System.out.print(Y);
		System.out.print(" ");
		System.out.print(Z);
		
	}
}