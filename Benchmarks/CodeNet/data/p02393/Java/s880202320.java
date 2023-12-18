import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] div = str.split(" ");
		int[] divint = new int[div.length];
		for(int i = 0;i<div.length;i++){
			 divint[i] = Integer.parseInt(div[i]);
		}
		Arrays.sort(divint);
		for(int i = 0;i<div.length-1;i++){
			System.out.print(divint[i] + " ");
		}
		System.out.println(divint[div.length-1]);
		
	}	
}