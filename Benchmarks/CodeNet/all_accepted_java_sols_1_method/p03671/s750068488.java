import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] N = new int[3];
		for (int i = 0; i < N.length; i++) {
			N[i] = scanner.nextInt();
		}
		Arrays.sort(N);
		System.out.println(N[0]+N[1]);
		
		scanner.close();
	}

}