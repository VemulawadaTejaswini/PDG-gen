import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		sc.close();
		int k = X / (Z + Y);
		if(X - k * (Z + Y) >= Z) {
			System.out.println(k);
		}else {
			System.out.println(k - 1);
		}
	}
}