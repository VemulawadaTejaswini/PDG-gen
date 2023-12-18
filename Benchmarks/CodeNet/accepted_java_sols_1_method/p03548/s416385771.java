import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		
		int max = ((X - Z) - (X - Z) % (Y + Z)) / (Y + Z);
		
		System.out.println(max);
		
	}
}
