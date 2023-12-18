package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	public static void main(String[] args) {
		 try {
		 BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		 String x;
			x = buf.readLine();
		 int y = Integer.parseInt(x);
		int z = y^3;
		System.out.println(z);
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
    }
}