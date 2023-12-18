package aizu.online.judge.ITP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String buf = br.readLine();
			String[] list = buf.split(" ");
			int a = Integer.parseInt(list[0]);
			int b = Integer.parseInt(list[1]);
			int c = Integer.parseInt(list[2]);
			if (a < b && b < c) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}