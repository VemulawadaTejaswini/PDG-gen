import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		try {
			int lim = Integer.parseInt(in.readLine());
			
			for (int i = 0; i < lim; i++) {
				String[] values = in.readLine().split(" ");
				int a = Integer.parseInt(values[0]);
				int b = Integer.parseInt(values[1]);
				int c = Integer.parseInt(values[2]);

				int x = a * a;
				int y = b * b;
				int z = c * c;
				if (((x + y) == z) || ((y + z) == x) || ((z + x) == y)) System.out.println("YES");
				else System.out.println("NO");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}