import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long num = sc.nextInt();
		long ans = 1;

		for(long count = num; count > 1; count--) {
			ans = ans * count;
		}

		System.out.println(ans);
		ans = 0;
	}

}