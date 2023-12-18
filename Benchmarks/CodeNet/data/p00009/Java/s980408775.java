import java.io.*;
import java.util.Scanner;


public class Main{
	static boolean isNumber(String s){
		try{
		int n = Integer.parseInt(s);
		return true;
		}catch(NumberFormatException e){
		return false;
		}
	}

	public static void main(String[] args){
		Scanner stdIn = null;
		stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int[] data = new int[100000];
		int i = 0;
		
		while( stdIn.hasNext() ){
			if( stdIn.hasNextInt() ){
				data[i] = stdIn.nextInt();
			} else {
				stdIn.next();
			}
			i++;
		}
		
	
		for(int j = 0; j < i; j++){
			int count = 0;
			if( data[j] >= 2 )
				count++;
			if( data[j] >= 3 )
				count++;

			int[] p = new int[999999];
			p[0] = 2;
			p[1] = 3;
			for(int l = 5; l <= data[j]; l += 2){
				for(int k =1; k < count; k++){
					if( l % p[k] == 0 ){
						break;
					}
					else if ( p[k] > Math.sqrt(l) ){
						p[count] = l;
						count++;
						break;
					}
				}
			}
			

			System.out.println(count);
		}
	}
}