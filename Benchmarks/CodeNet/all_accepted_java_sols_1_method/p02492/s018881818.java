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
				String op = scanner.next();
				int vR = Integer.parseInt(scanner.next());
				int ans = 0;
				switch(op){
					case "+":
						ans = vL + vR;
						break;
					case "-":
						ans = vL - vR;
						break;
					case "*":
						ans = vL * vR;
						break;
					case "/":
						ans = vL / vR;
						break;
					case "?":
						return;
				}
				System.out.println(ans);
			}
		}
		catch(IOException e) {
			System.out.print("Read error.");
			return;
		}
	}
}