//package pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String strR = insBR.readLine();
			double dbR = Double.parseDouble(strR);
			double dbArea = dbR * dbR * Math.PI;
			String strArea = String.format("%1$.5f", dbArea);
			double dbCircle = dbR * 2 * Math.PI;
			String strCircle = String.format("%1$.5f", dbCircle);
			System.out.println(strArea + " " + strCircle);
		}catch(IOException e){
			System.out.println("入力が無効です。");
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください。");
		}
	}
}

