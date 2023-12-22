import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int sum = 0;
		int[] line = new int[3];

		for (int i = 0; i < 3; i++) {
			line[i] = sc.nextInt();
			sum += line[i];
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 3; i++) {
			min = Math.min(min, sum-line[i]);
		}

		System.out.println(min);
		
	}

}
