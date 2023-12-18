import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
		int[] count = new int[26];
		String x = "";
		
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		
		try {
			while ((x = in.readLine()) != null) {
				for (int i = 0; i < x.length(); i++) {
					char c = x.charAt(i);
					if ((c < 'A') || (c > 'z')) continue;
					
					if (c < 'a') {
						count[c - 'A']++;
					} else {
						count[c - 'a']++;
					}
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < count.length; i++) {
			char c = (char)(i + 'a');
			System.out.println(c + " : " + count[i]);
		}
	}
}