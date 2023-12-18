import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int p1, p2, p3, j1, j2;
		
		p1 = sc.nextInt();
		p2 = sc.nextInt();
		p3 = sc.nextInt();
		j1 = sc.nextInt();
		j2 = sc.nextInt();
		
		System.out.println(Math.min(p1, Math.min(p2, p3)) + Math.min(j1, j2) - 50);
	}
}