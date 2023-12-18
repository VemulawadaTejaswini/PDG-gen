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
			int len = 3;
			int i = 0;
			int list[] = new int[len];
			buf = br.readLine();
			Scanner scanner = new Scanner(buf);
			while(scanner.hasNext()){
				list[i++] = Integer.parseInt(scanner.next());
			}
			int k, tmp;
			for(i = 0; i < len; i++){
				for(k = i + 1; k < len; k++){
					if(list[i] > list[k]){
						tmp = list[i];
						list[i] = list[k];
						list[k] = tmp;
					}
				}
			}
			for(i = 0; i < len; i++){
				System.out.print(list[i]);
				if(i < len - 1){
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
}