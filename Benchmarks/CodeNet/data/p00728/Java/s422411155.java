import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] values = new int[100];
		while (true) {
			int stop = 0;
			for (int i = 0; i < values.length; i++) {
				values[i] = sc.nextInt();
				if (values[i] == 0) {
					stop = i;
					break;
				}
			}
			int min = 1000, max = 0;
			for (int i = 0; i < stop; i++) {
				if (values[i] >= max) {
					max = values[i];
				}
				if (values[i] <= min) {
					min = values[i];
				}
			}
			double ave = 0;
			for (int i = 0; i < stop; i++) {
				ave += values[i];
			}
			ave -= (max + min);
			ave /= stop - 2;
			System.out.println(ave);
		}
	}
}