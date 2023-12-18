import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			StringBuilder s=new StringBuilder(); 
			int val = Integer.parseInt(br.readLine());
			int x = 0;

			for (int i = 1; i <= val; i++) {
				if (i % 3 == 0 || i % 10 == 3) {
					s.append(" " + i);
				} else {
					x = i / 10;
					while (x != 0) {
						if (x % 10 == 3) {
							s.append(" " + i);
							break;
						}
						x /= 10;
					}
				}
			}
			System.out.println(s);
			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}