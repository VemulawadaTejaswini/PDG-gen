import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int diffHeightA = sc.nextInt();
		int diffHeightB = sc.nextInt();

		int diffHeight = diffHeightB - diffHeightA;
		int count = diffHeight - 1;
		int heightA = 0;

		for(int i = 1; i <= count; i++) {
			heightA += i;
		}

		int Ans = heightA - diffHeightA;
		System.out.println(Ans);

	}
}