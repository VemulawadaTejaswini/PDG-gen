package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AOJ0046 {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		double now_read,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		String line = "";
		while(true){
			line = read.readLine();
			if(line.equals(null)){
				break;
			}
			try{
				now_read = Double.valueOf(line);
			}
			catch(Exception e){
				break;
			}
			max = (max<now_read)?now_read:max;
			min = (min>now_read)?now_read:min;
		}
		System.out.println(max-min);
	}
}