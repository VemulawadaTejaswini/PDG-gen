import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int[] count=new int[26];
		char ch='a';
		for(;(str=br.readLine())!=null;){
			str=str.toLowerCase();
			for(int i=0;i<str.length();i++){
				if(Character.isLetter(str.charAt(i)))
					count[Character.toLowerCase(str.charAt(i))-'a']++;
				
			}
		}
		for(int i=0;i<26;i++){
			System.out.println(ch++ +" : "+count[i]);
		}
	
	
	}}