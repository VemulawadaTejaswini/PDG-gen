import java.io.*;

public class Main {

	public static void main(String[] args)throws IOException{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String str = br.readLine();
		
		char[] strc = str.toCharArray();
		for(int i = 0; i < str.length()/2; i++){
			char m = strc[i];
			strc[i] = strc[str.length()-i-1];
			strc[str.length()-i-1] = m;
		}
		for(int i = 0; i < str.length(); i++){
			System.out.print(strc[i]);
		}
		System.out.println();
	}

}