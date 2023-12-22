import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = S / 3600;
		S -= h * 3600;
		int m = S / 60;
		S -= m * 60;
		System.out.println(h + ":" + m + ":" + S);
	}
}