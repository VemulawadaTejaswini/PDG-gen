import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = br.readLine();
			if(line == null){
				break;
			}
			String[] splitedLine = line.split(" ");
			
			Map<String,List<Integer>> wordsInfo = new HashMap<>();
			for(int i = 0 ; i < splitedLine.length ; i++ ){
				if(wordsInfo.containsKey(splitedLine[i])){
					List<Integer> tmplist = wordsInfo.get(splitedLine[i]);
					Integer tmpInt = tmplist.get(0);
					tmplist.set(0, ++tmpInt);
				}else{
					List<Integer> tmplist = new ArrayList<>();
					tmplist.add(1);
					wordsInfo.put(splitedLine[i], tmplist);
				}
			}
			
			String maxLengthWord = "";
			String mostFrequentWord = "";
			int maxCount = 0;
			
			for(String word : wordsInfo.keySet()){
				
				if(word.length() > maxLengthWord.length()){
					maxLengthWord = word;
				}
				
				if(wordsInfo.get(word).get(0) > maxCount){
					maxCount = wordsInfo.get(word).get(0);
					mostFrequentWord = word;
				}
			}
			
			System.out.println(mostFrequentWord + " " + maxLengthWord);
		}
	}

}