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
		int n, i;
		try {
			for(;;){
				str = br.readLine();
				if(str.equals("-")){
					break;
				}
				n = Integer.parseInt(br.readLine());
				for(i = 0; i < n; i++){
					buf = br.readLine();
					Scanner scanner = new Scanner(buf);
					int h = scanner.nextInt();
					str =str.substring(h) + str.substring(0, h);
				}
				System.out.println(str);
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
}