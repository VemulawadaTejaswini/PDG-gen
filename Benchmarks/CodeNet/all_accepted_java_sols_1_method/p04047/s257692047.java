import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int N = in.nextInt();
		int[] l = new int[2 * N];
		for(int i = 0; i < 2 * N; i++){
			l[i] = in.nextInt();
		}
		Arrays.sort(l);
		int sum = 0;
		for(int i = 0; i < 2 * N; i += 2){
			sum += Math.min(l[i], l[i + 1]);
		}
		System.out.println(sum);
	}
}
