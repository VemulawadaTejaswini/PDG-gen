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
				int i, x, n = scanner.nextInt();

				for(i = 1; i <= n; i++){
					x = i;
					if(x % 3 == 0){
						System.out.print(" " + i);
					} else{
						for(;;){
							if(x % 10 == 3){
								System.out.print(" " + i);
								break;
							}
							x /= 10;
							if(x == 0){
								break;
							}
						}
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