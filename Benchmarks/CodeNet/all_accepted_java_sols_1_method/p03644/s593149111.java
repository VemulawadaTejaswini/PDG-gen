import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = { 1, 2, 4, 8, 16, 32, 64, 101 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] > N) {
				System.out.println(array[i - 1]);
				break;
			}
		}
	}
}
