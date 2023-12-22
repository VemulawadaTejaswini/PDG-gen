import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			double S = Double.parseDouble(str);
			int h = (int)Math.floor(S / 3600);
			int m = (int)Math.floor((S % 3600) / 60);
			int s = (int)Math.floor((S % 3600) % 60);
			System.out.println(h + ":" + m + ":" + s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}