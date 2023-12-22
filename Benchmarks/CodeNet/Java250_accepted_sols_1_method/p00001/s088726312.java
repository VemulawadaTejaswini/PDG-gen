import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int[] data = new int[10];
		final String BR = System.getProperty("line.separator");
		int first = 0, second = 0, third = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			data[i] = Integer.parseInt(in.readLine());
		}
		for (int datum : data) {
			int temp1 = 0, temp2 = 0;
			for (int j = 1; j <= 3; j++) {
				if (first < datum) {
					temp1 = first;
					temp2 = second;
					first = datum;
					second = temp1;
					third = temp2;
					break;
				}
				if (second < datum) {
					temp2 = second;
					second = datum;
					third = temp2;
					break;
				}
				if (third < datum) {
					third = datum;
				}
			}
		}

		System.out.println(first + BR + second + BR + third);
	}
}