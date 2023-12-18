

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String strN = insBR.readLine();
			int n = Integer.parseInt(strN);
			int[] intA = new int[n];
			String[] strA = insBR.readLine().split(" ");
			for(int i = 0;i < n ;i++){
				try{
					intA[i] = Integer.parseInt(strA[i]);
				}catch(NumberFormatException e){
					e.printStackTrace();;
				}
			}
			for(int i = intA.length -1; 0 <= i; i--){
				if(i != 0){
					System.out.print(intA[i] + " ");
				}else{
					System.out.println(intA[i]);
				}

			}
		}catch(IOException e){
			System.out.println("入力が無効です。");
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください。");
		}
	}

}

