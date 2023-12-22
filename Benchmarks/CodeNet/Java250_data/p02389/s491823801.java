import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x,y;

		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println((x*y) +" "+(x*2 + y*2));

		sc.close();
	}

}