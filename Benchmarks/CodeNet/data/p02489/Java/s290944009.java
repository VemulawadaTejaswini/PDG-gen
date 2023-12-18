import java.io.*;
public class Main {
	public static void main(String[] args) {
		int i = 1, x = 1;
		while (x != 0) {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			try {
				String buf = br.readLine();
	            x = Integer.parseInt(buf);
			} catch(Exception e) {
	            x = 0;
			}
			if (x == 0) break;
			System.out.println("Case " + i + ": " + x);
			i++;
		}
	}
}