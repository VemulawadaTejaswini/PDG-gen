import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = 0;
		int B = 0;
		int result = 0;
		int[] rs = new int[1000];
		for(int i = 0; i < N; i++) {
			A = scan.nextInt();
			B = scan.nextInt();
			result += B - A;
		}
		System.out.println(result + N);
		scan.close();
	}
}
