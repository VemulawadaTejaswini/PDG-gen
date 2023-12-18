import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long N = sc.nextInt();
		long x = 0;
		int i;
		for(i = 0; i * i <= N; i++) {
			x = i * i;
		}
		System.out.println(x);
	}
}