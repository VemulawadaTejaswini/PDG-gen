import java.util.*;

public class Main{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		int[] alpha = new int[26];

		while(sc.hasNextLine()){
			String line = sc.nextLine();
			for(int i = 0; i < line.length(); i++){
				if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z'){
					alpha[line.charAt(i) -'A']++;
				}
				if(line.charAt(i) >= 'a' && line.charAt(i) <= 'z'){
					alpha[line.charAt(i) - 'a']++;
				}
			}
		}
		for(int i = 0; i < 26; i++){
			System.out.printf("%c : %d\n", 'a'+i, alpha[i]);
		}
	}
}