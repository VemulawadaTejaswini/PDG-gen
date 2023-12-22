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
				int h = scanner.nextInt();
				int w = scanner.nextInt();

				int x, y;

				if(w == 0 && h == 0){
					return;
				}

				for(y = 0; y < h; y++){
					for(x = 0; x < w; x++){
						if(((x + y) & 1) == 1){
							System.out.print(".");
						} else{
							System.out.print("#");
						}
					}
					System.out.print("\n");
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