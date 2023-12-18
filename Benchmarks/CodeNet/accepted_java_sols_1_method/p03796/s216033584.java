import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		long res = 1;
		for(int i=1; i<=n; i++) {
			res = (res * i) % 1000000007L;
		}
		
		System.out.println(res);
	}
}
