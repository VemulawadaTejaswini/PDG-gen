import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		
		int hako = 0;
		
		hako = X;
		X = Y;
		Y = hako;
		
		hako = X;
		X = Z;
		Z = hako;
		
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
	}
}
