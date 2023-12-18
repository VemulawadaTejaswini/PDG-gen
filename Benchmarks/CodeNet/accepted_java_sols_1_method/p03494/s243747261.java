import static java.lang.Math.min;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int num = Integer.parseInt(scanner.nextLine());
    	String[] numbersStr = scanner.nextLine().split(" ");
    	int[] numbers = new int[num];

    	int proc = Integer.MAX_VALUE;
		for (int i=0; i<num; i++) {
			numbers[i] = Integer.parseInt(numbersStr[i]);
			if (numbers[i] % 2 != 0) {
				System.out.println(0);
				System.exit(0);
			}
			int m = numbers[i];
			int internal = 0;
			while (m % 2 == 0) {
				internal++;
				m = m >> 1;
			}
			proc = min(proc, internal);
		}
		System.out.println(proc);
    }
}