import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> words = new HashMap<String, Integer>();

		String line = null;
		try {
			line = br.readLine();
				line = line.trim();

				String[] splitedLine = line.split(" ");
				String longest = "", most = null;
				int max = 0;
				for(String word : splitedLine){
	        		if(words.containsKey(word) == true){
	        			words.put(word, words.get(word) + 1);
	        			max = max < words.get(word) ?  words.get(word) : max;
	        		} else {
	        			words.put(word, 1);
	        		}
	        	}

				for(String key : words.keySet()) {
					if(key.length() > longest.length()) longest = key;
					if(max == words.get(key)) most = key;
				}

				System.out.println(most + " " + longest);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}