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
				Scanner scanner = new Scanner(buf);
				int h = Integer.parseInt(scanner.next());
				int w = Integer.parseInt(scanner.next());
				if(h == 0 && w == 0){
					return;
				}
				int x, y;
				for(y = 0; y < h; y++){
					for(x = 0; x < w; x++){
						System.out.print("#");
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