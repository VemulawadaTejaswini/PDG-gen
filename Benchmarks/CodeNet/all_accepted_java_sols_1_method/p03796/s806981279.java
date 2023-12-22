import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long res = 1L;
		for (int i=1; i<=N; i++) {
			res = (i*res)%((long)Math.pow(10,9)+7);
		}
		System.out.println(res);
	}
}
