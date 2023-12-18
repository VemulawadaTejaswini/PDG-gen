
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int alph[] = new int[26];
		while(sc.hasNext()){
			String S = sc.next();
			for(int i = 0; i < S.length(); i++){
				char c = S.charAt(i);
				if('A' <= c && c <= 'Z'){
					alph[c - 'A']++;
				} else if('a' <= c && c <= 'z'){
					alph[c - 'a']++;
				}
			}
		}
		for(char c = 'a'; c <= 'z'; c++){
			System.out.println(c + " : " +alph[c-'a']);
		}
	}
}