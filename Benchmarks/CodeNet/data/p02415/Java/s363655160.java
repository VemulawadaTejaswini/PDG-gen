

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{

			String strLine = insBR.readLine();
			char[] chLine = strLine.toCharArray();
			boolean blBig = false;
			for(int i = 0; i < chLine.length; i++){
				blBig = Character.isUpperCase(chLine[i]);
				if(blBig == false){
					chLine[i] = Character.toUpperCase(chLine[i]);
				}else{
					chLine[i] = Character.toLowerCase(chLine[i]);
				}
				System.out.print(chLine[i]);
			}
			System.out.println();
		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}

}

