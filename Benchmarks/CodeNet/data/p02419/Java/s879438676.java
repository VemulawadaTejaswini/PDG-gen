package Vol0;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static int cnt = 0;
	private static String keyword;
	private static final String EOF = "END_OF_TEXT";
	
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		keyword = br.readLine().toUpperCase();
		
		String line;
		String[] arrays;
		while (!EOF.equals(line = br.readLine().toUpperCase())) {
			line = br.readLine().toUpperCase();
			arrays = line.split(" ");
			for(int i=0;i<arrays.length;i++){
				if(keyword.equals(arrays[i])){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}