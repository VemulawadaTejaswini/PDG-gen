import java.io.*;
public class Main {
	public static void main(String[] args) {
		int i = 1, x;
		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				String str = br.readLine();
	            x = Integer.parseInt(str);
			} catch(Exception e) {
	            x = 0;
			}
			if (x == 0) break;
			System.out.println("Case " + i + ": " + x);
			i++;
		}
	}
}