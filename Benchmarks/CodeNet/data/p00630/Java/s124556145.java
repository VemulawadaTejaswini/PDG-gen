import java.util.*;

public class Main {

	static char[] tango;
	static String str;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			str = cin.next();
			String c = cin.next();
			if(c.equals("X")){
				break;
			}
			tango = new char[300];
			System.out.println(CamelCase(c.charAt(0)));
		}
	}
	static String CamelCase(char c){
		String res = "";
		int wordCnt=0;
		int before=0;
		boolean under=false;;
		String[] words = new String[100];
		for(int i = 0; i < 100; i++){
			words[i]="";
		}
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i)=='_'){
				under=true;
				words[wordCnt]=str.substring(before, i);
				before = i+1;
				wordCnt++;
			}

		}
		if(under){
			words[wordCnt]=str.substring(before, str.length());
			wordCnt++;
		}
		else{
			for(int i = 1; i < str.length();i++){
				char a = str.charAt(i);
				if(a <= 'Z' && a >= 'A'){
					words[wordCnt++]=str.substring(before, i);
					before=i;
				}
			}
			words[wordCnt++]=str.substring(before, str.length());
		}
		for(int i = 0; i < wordCnt; i++){
			//System.out.println(words[i]);
		}
		if(c == 'L'){
			for(int i = 0; i < wordCnt; i++){
				if(i==0){
					char a = words[i].charAt(0);
					a = Character.toLowerCase(a);
					words[i] = a + words[i].substring(1, words[i].length());
				}
				else{
					char a = words[i].charAt(0);
					a = Character.toUpperCase(a);
					words[i] = a + words[i].substring(1, words[i].length());
				}
				res += words[i];
			}
		}
		else if(c == 'U'){
			for(int i = 0; i < wordCnt; i++){
				char a = words[i].charAt(0);
				a = Character.toUpperCase(a);
				words[i] = a + words[i].substring(1, words[i].length());
				res += words[i];
			}
			
		}
		else if(c == 'D'){
			for(int i = 0; i < wordCnt; i++){
				char a = words[i].charAt(0);
				a = Character.toLowerCase(a);
				words[i] = a + words[i].substring(1, words[i].length());
				if(i!=0){
					res += "_";
				}
				res += words[i];
			}
		}
		return res;
	}

}