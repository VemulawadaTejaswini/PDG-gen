import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int val = Integer.parseInt(br.readLine());
			for (int i = 1; i <= val; i++) {
				if (i % 3 == 0 || i % 10 == 3)
					System.out.print(" " + i);
			}
			System.out.println();
			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}