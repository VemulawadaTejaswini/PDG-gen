import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static BufferedReader br;
	public static void main(String[] args)throws IOException{
		br = new BufferedReader(new InputStreamReader(System.in));
		int c[]=new int[26];
		String str;
		while((str = br.readLine())!=null){
			str = str.toLowerCase();
			for(int i=0;i<str.length();i++){
				char a='a';
				for(int j=0;j<26;j++){
					if(!Character.isLetter(str.charAt(i)))break;
					if(a==str.charAt(i)){
						c[j]++;
					}
					a++;
				}
			}
		}
		for(int i=0;i<26;i++){
			System.out.println((char)('a'+i)+" : "+c[i]);
		}
	}
}