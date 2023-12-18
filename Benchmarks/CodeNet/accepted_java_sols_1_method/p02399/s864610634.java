//package pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
		try{
			String[] strA = insBR.readLine().split(" ");
			int[] intA = new int[strA.length];
			double[] dbA = new double[strA.length];
			for(int i = 0;i < strA.length ;i++){
				intA[i] = Integer.parseInt(strA[i]);
				dbA[i] = Integer.parseInt(strA[i]);
			}
			int d = intA[0] / intA[1];
			int r = intA[0] % intA[1];
			double f = dbA[0] / dbA[1];
			String strF = String.format("%1$.5f", f);
			System.out.println(d + " " + r + " " + strF);
		}catch(IOException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
}

