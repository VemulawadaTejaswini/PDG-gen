package no0522;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			int n = s.length();
			int ioi = 0,joi = 0;
			for(int i=0;i<n-3;i++) {
				String t = s.substring(i, i+3);
				if (t.equals("JOI")) {
					joi++;
				}
				if (t.equals("IOI")) {
					ioi++;
				}
			}
			System.out.println(joi);
			System.out.println(ioi);
		}
	}
}