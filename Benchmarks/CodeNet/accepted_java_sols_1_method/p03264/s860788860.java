import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int a = K/2;
		int b = K-a;

		System.out.println(a*b);

	}

}
