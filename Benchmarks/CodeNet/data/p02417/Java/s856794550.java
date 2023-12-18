
import java.util.*;

public class Main {
	 
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int res[]=new int[26];
		
		while(true) {
			String str=cin.nextLine();
			if(str.length()==0)break;
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
				if(c>=65 && c<=90)res[c-65]++;
				else if(c>=97 && c<=122)res[c-97]++;
			}
			
			str=null;
		}
		
		for(int i=0;i<26;i++) {
			System.out.println((char)(i+97)+" : "+res[i]);
		}
		
	}
	
}
