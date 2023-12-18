import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i=0; i < n; i++) array[i] = sc.nextInt();
		sc.close();
		StringBuilder sb = new StringBuilder();
		for (int i=n-1; 0 < i; i--) sb.append(array[i] + " ");
		sb.append(array[0]);
		System.out.println(sb.toString());
	}
}