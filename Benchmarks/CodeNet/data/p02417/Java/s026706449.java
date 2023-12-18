import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char a='a';
		String str;
		int count[]=new int['z'-a+1];
		for(;(str=br.readLine())!=null;){
			for(int i=0;i<str.length();i++){
				if(Character.isAlphabetic(str.charAt(i)))
					count[Character.lowSurrogate(str.charAt(i))-'a']++;	
			}
		}
		for(int i=0;i<'z'-a-1;i++)
			System.out.println(a+++" : "+count[i]);
		
	
	
	}}