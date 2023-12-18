import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int[] mountain = new int[10];
		for (i = 0; i < 10; i++) {
			mountain[i] = sc.nextInt();
		}
		for (i = 9; i >= 1; i--) {
			for (j = 0; j < i; j++) {
				if (mountain[i] > mountain[i + 1]) {
					int temp = mountain[i];
					mountain[i] = mountain[i + 1];
					mountain[i + 1] = temp;
				}
			}
		}
		System.out.println(mountain[9]);
		System.out.println(mountain[8]);
		System.out.println(mountain[7]);
	}
}