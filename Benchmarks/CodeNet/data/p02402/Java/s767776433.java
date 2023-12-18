
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			long intSum = 0;
			String strN = insBR.readLine();
			int n = Integer.parseInt(strN);
			long[] intA = new long[n];
			String[] strA = insBR.readLine().split(" ");
			for(int i = 0;i < n ;i++){
				try{
					intA[i] = Integer.parseInt(strA[i]);
				}catch(NumberFormatException e){
					e.printStackTrace();;
				}
			}
			for(int i = 0; i < intA.length; i++){
				intSum += intA[i];
			}
			for(int i = 0; i < intA.length - 1; i++){
				for(int j = intA.length -1;i < j; j--){
					if(intA[j] < intA[i]){
						long intAct = intA[i];
						intA[i] = intA[j];
						intA[j] = intAct;
					}
				}
			}
			System.out.println(intA[0] + " " + intA[intA.length-1] + " " + intSum);
		}catch(IOException e){
			System.out.println("入力が無効です。");
		}catch(NumberFormatException e){
			System.out.println("数値を入力してください。");
		}
	}
}

