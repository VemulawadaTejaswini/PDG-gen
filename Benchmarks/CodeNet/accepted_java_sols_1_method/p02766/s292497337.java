import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int K =sc.nextInt();
		int con = 0;
		while (N >= K) {
			con++;
			N = N / K;
		}
		con++;
		System.out.println(con);
	}
}