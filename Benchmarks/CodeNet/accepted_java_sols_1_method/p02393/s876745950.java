import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[3];
		for(int i = 0; i < 3; i++) {
			list[i] = sc.nextInt();
		}
		Arrays.sort(list);
		System.out.print(list[0]);
		for(int i = 1; i < 3; i++) {
			System.out.print(" " + list[i]);
		}
		System.out.println();
	}
}