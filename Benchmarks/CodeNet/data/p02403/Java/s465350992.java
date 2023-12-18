package AIZU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args)  throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		while(true){

			String s = buf.readLine();
			String[] strlAry =s.split(" ");

			for(int i=0;i<strlAry.length;i++){
			}
			int a = Integer.parseInt(strlAry[0]);
			int b = Integer.parseInt(strlAry[1]);

		if(a != 0 && b != 0){
			for(int y = 1; y <= b ; y++){
				for ( int x = 1; x <= a ; x++ )	{
					System.out.print( "#" );
				}
				System.out.println();
			}
			continue;
		}
		else  if(a == 0 && b == 0){
			break;
			}
		}
	}
}

/*1/30 JAVAのIF文がわからないから飛ばす。一端他の教材で写経をする。*/