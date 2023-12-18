import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		String line1 = br.readLine();
		while(true){

			String line = br.readLine();
			if ("END_OF_TEXT".equals(line)) {break;}
			String[] str = line.split(" ");
			for (int i=0; i<str.length ; i++ ) {
				if (str[i].equalsIgnoreCase(line1)) {
					count++;	
				}
			}
		}
		System.out.println(count);
	}
}