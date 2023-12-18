import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = Long.parseLong(sc.next());
		long t = Long.parseLong(sc.next());
		System.out.println((x - t >= 0)? x - t : "0");
	}
}