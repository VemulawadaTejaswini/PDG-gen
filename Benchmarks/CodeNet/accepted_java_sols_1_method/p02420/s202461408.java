import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String cards;
			String str;
			int h;
			String begin;
			String end;
			while (!(cards = reader.readLine()).equals("-")) {
				str = reader.readLine(); 
				int m = Integer.parseInt(str);
				for (int i = 0; i < m; i++) {
					str = reader.readLine();
					h = Integer.parseInt(str);
					begin = cards.substring(0, h);
					end = cards.substring(h, cards.length());
					cards = end.concat(begin);
				}
				System.out.println(cards);
			}
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}