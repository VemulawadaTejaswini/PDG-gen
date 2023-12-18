import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {

	static char[] xx = new char[] {'S','H','C','D'};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if(m == -1 && f == -1 && r == -1) break;
			
			if(m == -1 || f == -1) {
				System.out.println("F");
				continue;
			}
			if(m + f >= 80) {
				System.out.println("A");
				continue;
			}
			else if(m + f >= 65) {
				System.out.println("B");
			}
			else if(m + f >= 50) {
				System.out.println("C");
			}
			else if(m +f < 30) {
				System.out.println("F");
			}
			else {
				System.out.println((r >= 50)?"C":"D");
			}
			
		}

	}
}