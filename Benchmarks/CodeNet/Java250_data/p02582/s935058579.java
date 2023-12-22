import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s = new Scanner(System.in).next();
		System.out.println(s.equals("RRR") ? 3 : s.contains("RR") ? 2 : s.contains("R") ? 1 : 0);
	}
}
