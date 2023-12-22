import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			for (;;) {
				String input = reader.readLine();
				String[] array = input.split(" ");
				int n = Integer.parseInt(array[0]);
				int x = Integer.parseInt(array[1]);
				
				if (n == 0 && x == 0) {
					break;
				}
				int count = 0;
				for (int i = 1; i <= n - 2; i++) {
					for (int j = i + 1; j <= n - 1; j++) {
						for (int k = j + 1; k <= n; k++) {
							if ((i + j + k) == x) {
								count++;
							}
						}
					}
				}
				System.out.println(count);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}