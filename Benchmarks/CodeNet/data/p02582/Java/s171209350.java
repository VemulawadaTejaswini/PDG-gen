package test;

import java.util.Scanner;

public class Atc {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String data = scn.nextLine();
		int count = 0;
		int res = 0;
		for (int i = 0; i < 3; i++) {
			if (data.charAt(i) == 'R') {
				count++;
			}
			if (data.charAt(i) == 'S') {
				count = 0;
			}
			if (count > res) {
				res = count;
			}
		}
		System.out.println(res);
	}

}
