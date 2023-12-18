package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int inputArrayNum = Integer.parseInt(br.readLine());
			String[] inputStr = br.readLine().split(" ");
			String[] outputStrArr = new String[inputArrayNum];

			for (int i = inputArrayNum - 1; i > -1; i--) {
				outputStrArr[i] = inputStr[inputArrayNum - i - 1];
			}

			int i = 0;
			for (String output : outputStrArr) {
				System.out.print(output);
				i++;
				if (i != inputArrayNum) {
					System.out.print(" ");
				} else {
					System.out.print("");
				}
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}