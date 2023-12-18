import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s = reader.readLine();
				
			int n = Integer.parseInt(s);
			
			int i = 1;
			while (++ i <= n) {
				int x = i;
				if (x % 3 == 0) {
					System.out.print(" ");
					System.out.print(i);
					continue;
				}
				do {
					if (x % 10 == 3) {
						System.out.print(" ");
				 		System.out.print(i);
						break;
					}
					x /= 10;
				} while (x != 0);
			}
			System.out.println();				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}