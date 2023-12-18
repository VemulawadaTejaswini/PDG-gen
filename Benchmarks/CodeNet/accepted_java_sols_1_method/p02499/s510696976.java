import java.util.*;
import java.lang.Character;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[26];
    while(sc.hasNext()){
    	String s = sc.nextLine();
    	for(int i=0;i<s.length();++i){
    		char c = s.charAt(i);
    		c = Character.toLowerCase(c);
    		if('a'<=c && c<='z')++a[c-'a'];
    	}
    }
	for(int i=0;i<26;++i)
		System.out.printf("%c : %d\n", i+'a', a[i]);
  }
}