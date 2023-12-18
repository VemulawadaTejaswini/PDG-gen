import java.util.HashMap;
import java.util.Scanner;


class Main {

	public static void main (String [] a){
		
		String longestWord = "";
		String mostFreqWord = "";
		
		Scanner in = new Scanner(System.in);
		String inputText = in.nextLine();

		String[] words = inputText.split(" ");
		HashMap<String, Integer> tempWordCtr = new HashMap<String, Integer>();
				
		for (String s: words){
			s = s.toLowerCase();
			
			if (s.length() > longestWord.length()){
				longestWord = s;
			}
			
			if (tempWordCtr.keySet().contains(s)){
				Integer count = tempWordCtr.get(s) + 1;
				tempWordCtr.put(s, count);
			} else {
				tempWordCtr.put(s, 1);
			}
		}
		
		Integer tempFreq = null;
		for (String s: tempWordCtr.keySet()){

			Integer i = tempWordCtr.get(s);
			if (tempFreq == null){
				tempFreq = i;
				mostFreqWord = s;
			}
			
			if (i > tempFreq){
				tempFreq = i;
				mostFreqWord = s;
			}
		}
		
		System.out.println(mostFreqWord + " " + longestWord);
	}
}