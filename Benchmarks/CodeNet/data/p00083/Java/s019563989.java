import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static long[] list = new long[10001];
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()) {
			int y = stdIn.nextInt();
			int m = stdIn.nextInt();
			int d = stdIn.nextInt();
			
			int day = y*365 + (m-1) * 30 + d;
			
			if(day < (1868*365 + 8 * 30 + 8)) {
				System.out.println("pre-meiji");
			}
			else if(day <= (1912*365 + 6 * 30 + 29)) {
				System.out.println("meiji " + (y-1867) + " " + m + " " + d);
			}
			else if(day <= (1926*365 + 11 * 30 + 24)) {
				System.out.println("taisho "+ (y-1911) + " " + m + " " + d);
			}
			else if(day <= (1989*365 + 7)) {
				System.out.println("showa "+ (y-1925) + " " + m + " " + d);
			}
			else {
				System.out.println("heisei "+ (y-1988) + " " + m + " " + d);
			}
		}
	}
}