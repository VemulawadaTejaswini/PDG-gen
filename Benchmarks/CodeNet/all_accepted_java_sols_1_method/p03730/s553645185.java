import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String ans = "NO";
		int A = reader.nextInt();
		int B = reader.nextInt();
		int C = reader.nextInt();
		for (int i = 1; i <= B; i++) {
			int tmp = A * i;
			if (tmp % B == C) {
				ans = "YES";
			}
		}
		System.out.println(ans);
		reader.close();

	}

}
