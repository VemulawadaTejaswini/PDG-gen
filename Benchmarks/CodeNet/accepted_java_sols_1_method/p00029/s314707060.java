import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] words = br.readLine().split(" ");

		map.put(words[0], 1);
		String longest = words[0];
		String freq = words[1];
		for(int i = 1; i < words.length ; i++){
			if(map.containsKey(words[i])){
				map.put(words[i], map.get(words[i]) + 1);
			}
			else {
				map.put(words[i], 1);
			}

			if(map.get(words[i]) > map.get(freq)){
				freq = words[i];
			}

			if(words[i].length() > longest.length()){
				longest = words[i];
			}
		}

		System.out.println(freq+" "+longest);
	}

}