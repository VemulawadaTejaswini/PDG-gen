import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {

	static char[] xx = new char[] {'S','H','C','D'};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String in = sc.next();
			if(in.equals("0")) break;
			char[] x = in.toCharArray();
			int sum = 0;
			for(int i = 0; i < x.length; i++) {
				sum += x[i] - '0';
			}
			System.out.println(sum);
			
		}

	}
}