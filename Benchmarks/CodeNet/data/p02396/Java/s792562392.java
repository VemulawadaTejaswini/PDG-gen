import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int N = 10000;
		int[] array = new int[N];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < N; i++) {
			array[i] = scan.nextInt();
			if (array[i] == 0) {
				break;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.println("Case " + (i+1) + ": " + array[i]);
			}
		}
	}

}