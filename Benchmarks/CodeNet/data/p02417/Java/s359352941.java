
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int[] count=new int[26];
		char ch=0;
		for(;(str=br.readLine())!=null;){
			str=str.toLowerCase();
			for(int i=0;i<str.length();i++){
				ch=str.charAt(i);
				if(Character.isAlphabetic(ch)){
					count[ch-'a']++;
				}
			}
		}
		for(char i='a';i!='z'+1;i++){
			System.out.println(i+" : "+count[i-'a']);
		}
	
	
	}}