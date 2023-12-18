import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int N = Integer.parseInt(spl[0]);
		int K = Integer.parseInt(spl[1]);
		sc.close();
		System.out.println(N - K + 1);
	}
}
