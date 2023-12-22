import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String x = "";
		try {
			while ((x = in.readLine()).equals("-") == false) {
				String word = x;
				int n = Integer.parseInt(in.readLine());
				
				for (int i = 0; i < n; i++) {
					int w = Integer.parseInt(in.readLine());
					word = word.substring(w, (word.length())) + word.substring(0, w);
				}
				System.out.println(word);
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