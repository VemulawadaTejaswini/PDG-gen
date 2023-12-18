

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		String strMessage = "";

		try{
			String[] strA = insBR.readLine().split(" ");
			int[] intA = new int[strA.length];
			for(int i = 0;i < strA.length ;i++){
				intA[i] = Integer.parseInt(strA[i]);
			}
			int intXR = intA[2] + intA[4];
			int intXR2 = intA[2] - intA[4];
			int intYR = intA[3] + intA[4];
			int intYR2 = intA[3] - intA[4];
			if(intXR <= intA[0] && 0 <= intXR2 && intYR <= intA[1] && 0 <= intYR2){
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

