import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s = reader.readLine();
			String t = reader.readLine();
			int n = Integer.parseInt(s);
			int[] a = new int[n];
			String[] b = t.split(" ");

			long sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(b[i]);
				sum += a[i];
			}
			int max = a[0];
			for (int j = 1; j < n; j++) {
				if (max < a[j]) {
					max = a[j];
				}
			}
			
			int min = a[0];
			for (int k = 1; k < n; k++) {
				if (min > a[k]) {
					min = a[k];
				}
			}
			
			System.out.println(min + " " + max + " " + sum);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}