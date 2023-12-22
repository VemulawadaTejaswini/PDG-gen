import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A%K==0||B%K==0) {
			System.out.println("OK");
			return ;
		}
		if (A/K==B/K) {
			System.out.println("NG");
		} else {
			System.out.println("OK");
		}
	}

}
