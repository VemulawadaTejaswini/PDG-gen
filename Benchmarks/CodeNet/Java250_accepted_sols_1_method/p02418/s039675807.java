import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String line2 = br.readLine();
		line1 = line1 + line1;
		if (line1.indexOf(line2) != -1) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}