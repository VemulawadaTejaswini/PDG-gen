

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String strS = insBR.readLine();
			int intS = Integer.parseInt(strS);
			int intM = 0;
			int intH = 0;
			if(3600 <= intS){
				intH = intS / 3600;
			}

			if(3600 <= intS){
				intM = intS / 60 % 60;
			}else if(60 <= intS){
				intM = intS / 60;
			}
			if(60 <= intS){
				intS = intS % 60;
			}
			System.out.println(intH + ":" + intM + ":" + intS);
		}catch(IOException e){
			System.out.println("入力が無効です。");
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください。");
		}
	}
}
