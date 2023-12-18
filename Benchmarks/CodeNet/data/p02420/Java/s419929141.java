import java.io.*;

public class Main{
	
	public static void mani(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while((str = br.readLine() != null) {
			if(str.equals("-")) break;
			int n = Integer.parseInt(br.readLine());
			for(int i = 0;i < n;i++){
				int h = Integer.parseInt(br.readLine());
				str = str.substring(h, str.length()) + str.substring(0,h);
			}
		}
	}
}