import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		int limit = sc.nextInt();
		int tmp = 0;
		int answer = 0;
		if (height > width) {
			while (tmp < limit) {
				tmp += height;
				answer++;
			}
		} else {
			while (tmp < limit) {
				tmp += width;
				answer++;
			}
		}
		System.out.println(answer);

	}
}
