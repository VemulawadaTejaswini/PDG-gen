import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] m = new int[N];
		for(int i=0; i<N; i++) {
			m[i] = sc.nextInt();
			X -= m[i];
		}
		Arrays.sort(m);
		System.out.println(N+(X/m[0]));
	}

}
