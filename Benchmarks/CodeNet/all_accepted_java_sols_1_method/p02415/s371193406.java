import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int l = str.length();
		char ch[] = str.toCharArray();
		for(int i=0;i<l;i++){
			if(Character.isUpperCase(ch[i])){
				ch[i] = Character.toLowerCase(ch[i]);
			}
			else if(Character.isLowerCase(ch[i])){
				ch[i] = Character.toUpperCase(ch[i]);				
			}
		}
		System.out.println(ch);		
	}
}	