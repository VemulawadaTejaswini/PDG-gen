

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int heights[] = new int[10];
		for (int i = 0; i < 10; i++) {
			heights[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(heights);
		
		for (int i = 9; i >= 7; i--) {
			System.out.println(heights[i]);
		}
	}

}