import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int sum = 1;
		for (int i=0;i<D;i++) {
			sum =sum *100;
		}
		if (N==100) {
			System.out.println(101*sum);
			return;
		}
		System.out.println(N*sum);
	}
}