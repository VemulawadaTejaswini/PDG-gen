

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("Case i:" + br.readLine());
		}while(Integer.parseInt(br.readLine()) != 0);
	}
}