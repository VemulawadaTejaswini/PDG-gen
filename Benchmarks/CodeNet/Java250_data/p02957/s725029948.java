import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		String IMPOSSIBLE = "IMPOSSIBLE";
		if(A % 2 != B % 2) System.out.println(IMPOSSIBLE);
		else System.out.println((A + B) / 2);
	}
}
