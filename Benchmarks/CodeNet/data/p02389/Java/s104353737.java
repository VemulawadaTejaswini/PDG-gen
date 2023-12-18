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
		
		String[] QSTR001E = CMD.split(" ");
		
		int[] QINT001E = new int[QSTR001E.length];
		
		try{
			for(int i = 0;i<QSTR001E.length;i++){
				QINT001E[i] = Integer.parseInt(QSTR001E[i]);
			}
		}catch(NumberFormatException e){
			
		}
		
		int QINT002E = QINT001E[0];
		int QINT003E = QINT001E[1];
		
		System.out.println(QINT002E*QINT003E+" " + 2*(QINT002E+QINT003E) );
	}

}