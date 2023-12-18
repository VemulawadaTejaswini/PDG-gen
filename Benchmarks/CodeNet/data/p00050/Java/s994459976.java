import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		try {
			while ((line = br.readLine()) != null) {
				line = line.trim();
				String[] words = line.split(" ");
				
				for(int i = 0; i < words.length; i++) {
					if(words[i].equals("apple")) {words[i] = "peach"; continue;}
					if(words[i].equals("peach")) {words[i] = "apple"; continue;}
				}
				String ans = Arrays.toString(words);
				ans = ans.replaceAll(", ", " ");
				ans = ans.replaceAll("^\\[", "");
				ans = ans.replaceAll("\\]$", "");
				System.out.println(ans);
				
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}