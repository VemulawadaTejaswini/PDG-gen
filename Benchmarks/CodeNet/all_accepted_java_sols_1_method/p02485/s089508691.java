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
			while(br.ready()){
				buf = br.readLine();
				if(buf.equals("0")){
					return;
				}
				int i;
				int sum = 0;
				for(i = 0; i < buf.length(); i++){
					sum += buf.charAt(i) - 0x30;
				}
				System.out.println(sum);
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
}