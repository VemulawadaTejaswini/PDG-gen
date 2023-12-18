import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		char c, i;
		int count[] = new int[0x80];

		for(i = 'a'; i <= 'z'; i++){
			count[i] = 0;
		}

		while(System.in.available() > 0){
			try{
				c = (char) System.in.read();
			}
			catch(Exception e){
				c = 0;
			} 
			if('a' <= c && c <= 'z'){
				count[c] ++;
			}
		}

		for(i = 'a'; i <= 'z'; i++){
			System.out.println(String.format("%c : %d", i, count[i]));
		}
		
	}
}