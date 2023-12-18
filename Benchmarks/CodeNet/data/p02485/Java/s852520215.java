package jp.waseda.ruri.nnujabok;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		while (x.equals("0") != true) {
			int sum = 0;
			for (int i = 0; i < x.length(); i++) {
				sum += Integer.parseInt(Character.toString(x.charAt(i)));
			}
			System.out.println(sum);
			x = sc.next();
		}
	}
}