import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		String CMD = null ;
		BufferedReader BR = null;
		BR = new BufferedReader(new InputStreamReader(System.in));
		try {
			CMD = BR.readLine();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		int x = Integer.parseInt(CMD);
		System.out.println(x*x*x);
		
		

	}

}