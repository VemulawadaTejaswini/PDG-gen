import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		n = (int)Math.sqrt(n);
		System.out.println((int)Math.pow(n, 2));
	}
}