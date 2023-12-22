

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String[] strA = insBR.readLine().split(" ");
			int[] intA = new int[strA.length];
			String strMessage = "";
			for(int i = 0;i < strA.length ;i++){
				intA[i] = Integer.parseInt(strA[i]);
			}
			if(intA[0] < intA[1] && intA[1] < intA[2]){
				strMessage = "Yes";
			}else{
				strMessage = "No";
			}
			System.out.println(strMessage);

		}catch(IOException e){
			System.out.println("入力が無効です。");
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください。");
		}
	}

}

