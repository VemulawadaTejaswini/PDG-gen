import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int s = Integer.parseInt(Integer.valueOf(A).toString() + Integer.valueOf(B).toString());
		int a = (int)Math.sqrt(s);
		if (a*a==s) System.out.println("Yes");
		else System.out.println("No");
	}
}
