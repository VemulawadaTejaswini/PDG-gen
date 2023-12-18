import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] nArray = new int[N];
		for (int i = 0; i < N; i++) {
			nArray[i] = scan.nextInt();
		}
		scan.close();
		int count = 0;
		for (int j = 0; j < N; j++) {
			if ((j + 1) % 2 == 1 && nArray[j] % 2 == 1) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}