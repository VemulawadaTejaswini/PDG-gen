

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int [] array = new int[7];
		int i = 0;
		int aaa;
		while(true) {
			aaa = Integer.parseInt(read.readLine());
			if ( 0 == aaa) {
				break;
			}
			System.out.println("Case " + (i + 1) +": "+aaa);
			i++;
		}
	}
	
}