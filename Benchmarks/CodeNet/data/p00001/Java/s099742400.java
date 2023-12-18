package aizuonlinejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
		public static void main(String[] args) throws NumberFormatException, IOException {
			int i;
			Integer[] input = new Integer[10];
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for(i = 0; i < 10; i++){
				input[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(input);
			for(i =7; i < 10; i++){
				System.out.println(input[i]);
			}

	}
}