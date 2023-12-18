

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		int d = Integer.parseInt(tmpArray[1]);
		
		int result = n / (2*d + 1);
		
		if(n % (2*d + 1) != 0){
			result++;
		}
		System.out.println(result);
	}

}
