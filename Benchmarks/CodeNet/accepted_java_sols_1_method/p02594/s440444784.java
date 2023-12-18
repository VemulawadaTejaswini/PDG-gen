//package abc174;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N >= 30) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
