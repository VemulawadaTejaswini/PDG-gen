import java.io.*;

public class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		char[] ch = new char[1200];
		int len, cnt = 0;
		try{
			str = br.readLine();
			len = str.length();
			ch = str.toCharArray();
			
			for(int i = 0; i < len; i++){
				if('a' <= ch[i] && ch[i] <= 'z'){
					ch[i] = Character.toUpperCase(ch[i]);
				}
				else if('A' <= ch[i] && ch[i] <= 'Z'){
					ch[i] = Character.toLowerCase(ch[i]);
				}
		}
		} catch(IOException e){
			System.out.println(e);
		}
		
		
		
		
		System.out.println(ch);
	}
}