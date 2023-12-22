import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		String minStr = null;
		try {
			int i = 1;
			while(br.ready()){
				int num = Integer.parseInt(br.readLine());
				if(num == 0){
					return;
				}
				System.out.println("Case " + i++ + ": " + num);
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
}