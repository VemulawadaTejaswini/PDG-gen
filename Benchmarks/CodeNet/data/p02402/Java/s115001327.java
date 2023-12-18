import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String n = br.readLine();
			String[] a = br.readLine().split(" ");
			int i, num, min = 1000000, sum = 0;
			int max = -1000000;
			for (i = 0; i < a.length; i++) {
				num = Integer.parseInt(a[i]);
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
				sum = sum + num;
			}
			System.out.println(min + " " + max + " " + sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}