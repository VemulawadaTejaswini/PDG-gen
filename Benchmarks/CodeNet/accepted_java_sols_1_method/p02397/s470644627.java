import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt(), y = sc.nextInt();
			if(x == 0 && y == 0) {
				break;
			}
			if(x > y) {
				int t = x;
				x = y;
				y = t;
			}
			System.out.println(x + " " + y);
		}
	}
}
