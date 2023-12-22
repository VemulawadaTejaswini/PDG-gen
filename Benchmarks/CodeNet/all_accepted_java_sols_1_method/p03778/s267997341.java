import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int aw = a + w;
		int bw = b + w;
		if (aw < b)
			System.out.println(b - aw);
		else if (bw < a)
			System.out.println(a - bw);
		else
			System.out.println("0");
	}
}