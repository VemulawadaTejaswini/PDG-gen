import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		String line2 = sc.nextLine();
		String[] set1 = line2.split(" ");
		int[] set = new int[n];
		long sum = 0;

		for (int i = 0; i < n; i++) {
			set[i] = Integer.parseInt(set1[i]);
			sum += set[i];
		}

		Arrays.sort(set);

		System.out.print(set[0]);
		System.out.print(" ");
		System.out.print(set[n-1]);
		System.out.print(" ");
		System.out.println(sum);
		
	}

}