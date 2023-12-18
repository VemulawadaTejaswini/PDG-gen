import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		String minStr = null;

		try {
			br.readLine();
			while(br.ready()){
				buf = br.readLine();
				Scanner scanner = new Scanner(buf);
				String s = scanner.next();
				if(minStr == null){
					minStr = s;
				} else if(minStr.compareTo(s) > 0){
					minStr = s;
				}
			}
			System.out.println(minStr);
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
}