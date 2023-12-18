import static java.lang.System.*;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		long min = 1000000;
		long max = -1000000;
		long sum = 0;
		for(int a = 1; a <= count; a++) {
			int num = sc.nextInt();
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
			sum += num;
		}
		out.println(min + " " + max + " " + sum);
	}
}
