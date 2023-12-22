import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		char[] alp = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int[] count = new int[26];
		while(scan.hasNext()){
			String word = scan.next();
			word = word.toLowerCase();
			for(int i = 0; i < word.length(); i++){
				char ch = word.charAt(i);
				for(int j = 0; j < 26; j++){
					if(ch == alp[j]){
						count[j]++;
					}
				}
			}
		}

		for(int i = 0; i < 26; i++){
			System.out.printf("%c : %d\n", alp[i], count[i]);
		}
	}
}