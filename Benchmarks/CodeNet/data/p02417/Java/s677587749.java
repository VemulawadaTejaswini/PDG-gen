import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		int a[]=new int[26];
		while((str=br.readLine())!=null){
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch<='z'&&ch>='a') a[ch-97]++;
		}
		}
		for(int i=0;i<26;i++){
			System.out.println((char)('a'+i) +" : "+a[i]);
		}
		
		
	}
}