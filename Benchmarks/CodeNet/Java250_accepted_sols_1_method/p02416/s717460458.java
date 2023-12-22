import java.io.*;
import java.util.Scanner;
import java.lang.*;

class Main{
	public static void main(String[] args){
		try{
			Scanner stdIn = new Scanner(System.in);
			while(true){
				String s = stdIn.nextLine();
				
				int l = s.length();
				int k = 0;
				for(int i = 0;i < l;i++){
					char a = s.charAt(i);
					int a2 = Character.getNumericValue(a);
					k += a2;
				}
				if(k == 0) break;
				System.out.print(k);
				System.out.println();
			}
		} catch(Exception e){
		}
	}
}			