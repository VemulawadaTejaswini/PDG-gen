import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String sentence = reader.readLine();
		String[] data = sentence.split(" ");
		String longestString = "";
		HashMap<String,Integer> freq = new HashMap<String, Integer>();
		for(String elem : data){
			if (longestString.length() < elem.length()){
				longestString = elem;
			}
			if(freq.containsKey(elem)){
				freq.put(elem, freq.get(elem)+1);
			}else{
				freq.put(elem, 1);
			}
		}
		Entry<String,Integer> maxEntry = null;
		for(Entry<String,Integer> entry : freq.entrySet()) {
		    if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
		        maxEntry = entry;
		    }
		}
		System.out.println(maxEntry.getKey() + " " + longestString);

	}

}