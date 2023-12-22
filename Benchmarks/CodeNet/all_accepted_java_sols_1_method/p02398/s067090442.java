

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String[] strA = insBR.readLine().split(" ");
			int[] intA = new int[strA.length];
			for(int i = 0;i < strA.length ;i++){
				intA[i] = Integer.parseInt(strA[i]);
			}
			int intCount = 0;
			for(int i = intA[0]; i <= intA[1]; i++){
				int intDiv = intA[2] % i;
				if(intDiv == 0){
					intCount++;
				}
			}
			System.out.println(intCount);
		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}

}

