import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int t = (N-1) / 111;
		System.out.println(111*(t+1));
	}
}
