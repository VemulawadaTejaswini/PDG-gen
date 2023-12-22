import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		int a[] = new int [n];
		String str[] = new String [n];
		String line;
		try {
			line = br.readLine();
			str = line.split(" ");
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(str[i]);
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += 1.0 / a[i];
		}
		
		System.out.println(1.0 / sum);
		
	}
}