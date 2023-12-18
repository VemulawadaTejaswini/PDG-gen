import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) break;
			
			System.out.println((a < b)?(a + " " + b):(b + " " + a));
		}
	}
}