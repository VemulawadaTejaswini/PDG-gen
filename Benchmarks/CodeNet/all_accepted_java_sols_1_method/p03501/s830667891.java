import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int A = reader.nextInt();
		int B = reader.nextInt();
		int ans = Math.min(N * A, B);

		System.out.println(ans);
		reader.close();
	}


}



