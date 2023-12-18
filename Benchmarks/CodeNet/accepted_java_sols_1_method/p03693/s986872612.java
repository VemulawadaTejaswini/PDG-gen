import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.next());
		int g = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		sc.close();
		int num = 100 * r + 10 * g + b;
		System.out.println(num%4==0 ? "YES" : "NO");
	}
}