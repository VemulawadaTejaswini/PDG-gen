import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		double b = 0;
		for(int i=0; i<N; i++) {
			a = sc.nextInt();
			b += 1.0/a;
		}
		sc.close();
		double c = 1/b;
		System.out.println(c);

	}

}