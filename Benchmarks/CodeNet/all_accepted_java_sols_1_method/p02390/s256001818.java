import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		String CMD = null ;
		BufferedReader BR = null;
		BR = new BufferedReader(new InputStreamReader(System.in));
		try {CMD = BR.readLine();
		} 
		catch (IOException e) {e.printStackTrace();
		}
		
		double time = Double.parseDouble(CMD);
		double jikan = time;
		jikan = jikan /3600;
		int jikan2 = (int) Math.floor(jikan);
		
		double amari = time % 3600;
		double hun = amari / 60;
		int hun2 = (int) Math.floor(hun);
		
		double byou = amari%60;
		int byou2 = (int) Math.floor(byou);
		
		
		
		System.out.println(jikan2+":"+hun2+":"+byou2);
	}

}