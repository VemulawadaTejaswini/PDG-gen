import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = Integer.parseInt(in.next());
		double V = Math.pow((double)L / 3, 3);
		
		System.out.println(String.format("%.12f", V));
	}
}	