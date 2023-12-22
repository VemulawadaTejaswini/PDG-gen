import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] line = new int[total];

		for(int i=0; i < total; i++) {
			line[i] = sc.nextInt();
		}

		Arrays.sort(line);
		int maxDiff = line[total-1] - line[0];

		System.out.println(maxDiff);
	}
}
