import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		final int DATAMAX = 10;
		int a[] = new int[DATAMAX];
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		for (int i = 0; i < DATAMAX; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < DATAMAX; i++) {
			for (int j = i+1; j < DATAMAX; j++) {
				if (a[i] < a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}
	}
}