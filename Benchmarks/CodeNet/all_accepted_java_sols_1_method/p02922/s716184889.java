import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int cur = 1;
		int K = 0;
		while(cur < B){
			cur = cur - 1;
			cur = cur + A;
			++K;
		}
		System.out.println(K);
	}
}
