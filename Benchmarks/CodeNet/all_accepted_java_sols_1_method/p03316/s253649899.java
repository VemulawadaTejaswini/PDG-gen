import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		int sum = 0;
		for (int i = 0; i < N.length(); i++) {
			sum += Integer.valueOf(N.substring(i, i+1));
		}

		System.out.println(Integer.valueOf(N) % sum == 0? "Yes" : "No");
	}
}
