import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			
			Map<String, Integer> countHash = new HashMap<>(); 

			//sort strings a to z
			for( int i = 0 ; i < n ; i++ ) {
				String s = sc.next();
				char[] chars = s.toCharArray(); 
				Arrays.sort(chars);
				String sorted_s = new String(chars);
//				System.out.println(sorted_s);
				
				int currentCount = 1;
				if ( countHash.containsKey(sorted_s)) {
					currentCount = countHash.get(sorted_s) + 1;
				}
				countHash.put(sorted_s, currentCount);
			}
			
			long answerCombination = 0;
			for(String key : countHash.keySet()) {
				long count = (long)countHash.get(key);
				if ( count > 1 ) {
					//2 --> 2C2
					//3 --> 3C2
					//4 --> 4C2
					long combination = count * (count - 1) / 2; 
					answerCombination += combination;
				}
			}
			
			System.out.println(answerCombination);
			
		}
	}
}