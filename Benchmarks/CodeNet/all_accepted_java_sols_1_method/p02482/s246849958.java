import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		try {
			while(br.ready()){
				buf = br.readLine();
				Scanner scanner = new Scanner(buf);
				int vL = Integer.parseInt(scanner.next());
				int vR = Integer.parseInt(scanner.next());
				if(vL < vR){
					System.out.println("a < b");
				} else if(vL > vR){
					System.out.println("a > b");
				} else{
					System.out.println("a == b");
				}
			}
		}
		catch(IOException e) {
			System.out.print("Read error.");
			return;
		}
	}
}