import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf, str;
		int n;
		char i;
		int ap[] = new int[128];
		try {
			int ch;
			while ((ch = System.in.read()) != -1)
			{
				if (ch != '\n' && ch != '\r')
				{
					ap[Character.toLowerCase(ch)]++;
				}
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}

		for(i = 'a'; i <= 'z'; i++){
			System.out.println(String.valueOf(i) + " : " + ap[i]);
		}
	}
}