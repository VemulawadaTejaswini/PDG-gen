import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		try {
			buf = br.readLine();
		}
		catch(IOException e) {
			System.out.print("Read error.");
			return;
		}
		Scanner scanner = new Scanner(buf);
		int x = Integer.parseInt(scanner.next());
		int y = Integer.parseInt(scanner.next());
		System.out.println((x * y) + " " + (2 * (x + y)));
	}
}