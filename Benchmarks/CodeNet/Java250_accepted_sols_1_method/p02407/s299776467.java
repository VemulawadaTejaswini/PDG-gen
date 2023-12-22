import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for(int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		System.out.print(l[n-1]);
		for(int i = n-2; i >= 0; i--) {
			System.out.print(" " + l[i]);
		}
		System.out.println();
	}
}