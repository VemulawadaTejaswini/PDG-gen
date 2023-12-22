import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day;
		int num;
		int[] array;

		day = scan.nextInt();
		num = scan.nextInt();

		array = new int[num];

		int n = 0;
		while(n < array.length) {
			array[n] = scan.nextInt();
			n++;
		}

		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		int minus = day - sum;
		if(minus < 0) {
			System.out.println(-1);
		} else {
			System.out.println(minus);
		}
	}
}
