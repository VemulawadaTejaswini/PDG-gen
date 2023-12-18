import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final int MAX = 600;

	public static void main(String[] args) {
		//?????°?¨????
		int length = 0;
		int ans = 0;
		int num = 0;
		int count = 0;

		while(sc.hasNext()) {
			length = sc.nextInt();

			for(count = 0; count * length < 600; count++) {
				num = length * count;
				ans += num * num;
			}

			ans *= length;

			System.out.println(ans);
			ans = 0;
		}

	}

}