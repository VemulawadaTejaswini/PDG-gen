import java.io.*;

class Main {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();
		
		char ch[] = str.toCharArray();
		
		for(int i = 0; i < ch.length; i++){
			if(Character.isUpperCase(ch[i])){
				ch[i] = Character.toLowerCase(ch[i]);
			}else ch[i] = Character.toUpperCase(ch[i]);
		}
		for(int i = 0; i < ch.length; i++){
			System.out.print(ch[i]);
		}	
		System.out.println();
	}
}	