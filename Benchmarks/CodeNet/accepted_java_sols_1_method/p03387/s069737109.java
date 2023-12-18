import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,C;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		if (A>=B&&A>=C) {
			System.out.println((A*2-(B+C))/2+(A*2-(B+C))%2*2);
		} else if (B>=A&&B>=C) {
			System.out.println((B*2-(A+C))/2+(B*2-(A+C))%2*2);
		} else if (C>=A&&C>=B) {
			System.out.println((C*2-(A+B))/2+(C*2-(A+B))%2*2);
		}
	}
}