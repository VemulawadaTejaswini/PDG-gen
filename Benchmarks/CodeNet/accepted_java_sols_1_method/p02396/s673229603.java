

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();


		
		int i,s;
		i = 0;

		while(true){
			i++;
			s = scan.nextInt();
			//s = Integer.parseInt(br.readLine());
			if(s == 0){break;}
			
			//str = str+ "Case " + Integer.toString(i) + ": " + str + "\n";
			
			sb.append("Case ");
			sb.append(Integer.toString(i));
			sb.append(": ");
			sb.append(Integer.toString(s));
			sb.append("\n");
			
			
			
		}

		System.out.print(new String(sb));

	}
}