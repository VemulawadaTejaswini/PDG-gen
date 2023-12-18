import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] words = line.split(" ");
		int i;
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		for(i=0;i<words.length;i++){
			if(map.containsKey(words[i])) map.put(words[i],map.get(words[i])+1);
			else map.put(words[i],1);
		}
		int temp=0;
		for(i=0;i<map.size();i++){
			if(map.get(words[i]) > temp) temp = map.get(words[i]);
		}
		for(i=0;i<map.size();i++){
			if(map.get(words[i]) == temp){
				System.out.print(words[i]+" ");
				break;
			}
		}
		String longestWord = "";
		for(i=0;i<words.length;i++){
			if(longestWord.length()<words[i].length()) longestWord = words[i];
		}
		System.out.println(longestWord);
	}
}