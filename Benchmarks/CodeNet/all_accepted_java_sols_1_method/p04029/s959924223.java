import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		for (int i = 0; i < N; i++) {
			a += (i+1);
		}
		System.out.println(a);

	}

}
