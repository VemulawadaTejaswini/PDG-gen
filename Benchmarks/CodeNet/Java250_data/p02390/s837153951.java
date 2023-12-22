import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String buf = br.readLine();
			int s = Integer.parseInt(buf);
			int h = s / 3600;
			s = s % 3600;
			int m = s / 60;
			s = s % 60;
			System.out.println(h + ":" + m + ":" + s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}