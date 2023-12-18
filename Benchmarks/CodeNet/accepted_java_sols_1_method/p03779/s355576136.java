import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		long t = 0;
		while (t * (t + 1) / 2 < x) {
			t++;
		}
		System.out.println(t);
	}
}