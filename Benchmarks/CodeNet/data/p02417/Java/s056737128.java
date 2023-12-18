import java.io.*;

public class Main31{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int count[] = new int[26];
		char abc = 'a';
		
		while((str=br.readLine())!=null){
			
			for(int i=0;i<str.length();i++){
				char abcd = str.charAt(i);
				abcd = Character.toLowerCase(abcd);
				for(int j =0;j<count.length;j++){
					if(abc==abcd) count[j]++;
					abc++;
					
				}
			}
		}
		for(int i=0;i<26;i++){
			System.out.println(abc + " : " +count[i]);
			abc++;
		}
		
		
	}
}