import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int max = Math.max(a+b, a-b);
		System.out.print(Math.max(max,a*b));
	}

}
