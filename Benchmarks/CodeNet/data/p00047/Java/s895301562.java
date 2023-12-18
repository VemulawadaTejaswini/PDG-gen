import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean[] x = new boolean[3];
		x[0] = true;
		while(stdIn.hasNext()) {
			String[] a = stdIn.next().split(",");
			int a1 = -1;
			int a2 = -1;
			if(a[0].charAt(0) == 'A') {
				a1 = 0;
			}
			if(a[0].charAt(0) == 'B') {
				a1 = 1;
			}
			if(a[0].charAt(0) == 'C') {
				a1 = 2;
			}
			if(a[1].charAt(0) == 'A') {
				a2 = 0;
			}
			if(a[1].charAt(0) == 'B') {
				a2 = 1;
			}
			if(a[1].charAt(0) == 'C') {
				a2 = 2;
			}
			boolean tmp = x[a2];
			x[a2] = x[a1];
			x[a1] = tmp;
		}
		if(x[0]) {
			System.out.println("A");
		}
		if(x[1]) {
			System.out.println("B");
		}
		if(x[2]) {
			System.out.println("C");
		}
	}
}