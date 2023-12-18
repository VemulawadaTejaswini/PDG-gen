import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[2*N];
		for (int i=0; i<2*N; i++) array[i] = sc.nextInt();
		Arrays.sort(array);
		int sum = 0;
		for (int i=0; i<2*N; i+=2) sum += array[i];
		System.out.println(sum);
		sc.close();
	}

}