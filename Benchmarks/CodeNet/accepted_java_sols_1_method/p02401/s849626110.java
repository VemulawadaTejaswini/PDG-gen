

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			try{
				String[] strA = insBR.readLine().split(" ");
				int intA = Integer.parseInt(strA[0]);
				int intB = Integer.parseInt(strA[2]);
				int intResult = 0;
				if("+".equals(strA[1])){
					intResult = intA + intB;
				}else if("-".equals(strA[1])){
					intResult = intA - intB;
				}else if("*".equals(strA[1])){
					intResult = intA * intB;
				}else if("/".equals(strA[1])){
					intResult = intA / intB;
				}else{
					break;
				}

				System.out.println(intResult);

			}catch(IOException e){
				System.out.println("入力が無効です。");
			}catch(NumberFormatException e){
				System.out.println("数値を入力してください。");
			}
		}
	}

}

