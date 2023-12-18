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
		try {
			while(br.ready()){
				buf = br.readLine();
				Scanner scanner = new Scanner(buf);
				int i, n = scanner.nextInt();

				for(i = 1; i <= n; i++){
					if(i % 3 == 0 || i % 10 == 3){
						System.out.print(" " + i);
					}
				}
				System.out.print("\n");
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
}