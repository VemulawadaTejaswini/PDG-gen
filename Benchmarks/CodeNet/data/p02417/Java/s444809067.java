import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		char [] alp = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int [] num = new int[26];
		while(scan.hasNext()){
			String sent = scan.next();
			String s = sent.toLowerCase();
			for(int i = 0; i < s.length(); i++){
				char c = s.charAt(i);
				for(int j = 0; j < 26; j++){
					if(c == alp[j]){
						num[j]++;
					}
				}
			}
		}

		for(int i = 0; i < 26; i++){
			System.out.printf("%c : %d\n", alp[i], num[i]);
		}
	}
}