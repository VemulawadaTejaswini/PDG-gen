import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){

		String line = scan.nextLine();
		String[] words = line.split(" ");
		int len = words.length;
		int[] counts = new int[len];
		int longest = 0;
		int max = 0;
		String sMax = "";
		String sLong = "";
		for(int i = 0; i < len; i++){
			if(words[i].length() > longest){
				longest = words[i].length();
				sLong = words[i];
			}
			for(int j = i + 1; j < words.length; j++){
				if(words[i].equals(words[j])){
					counts[i]++;
					if(max < counts[i]){
						max = counts[i];
						sMax = words[i];
					}
				}
			}
		}
		System.out.printf("%s %s\n", sMax, sLong);
	}
}