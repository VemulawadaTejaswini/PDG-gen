import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		if (R >= P && R >= Q)
			System.out.println(P + Q);
		else if (Q >= P && Q >= R)
			System.out.println(P + R);
		else
			System.out.println(Q + R);
		sc.close();
	}
}