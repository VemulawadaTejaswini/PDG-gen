import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		while(true) {
			int x = sc.nextInt();
			if(x == 0) break;
			System.out.println("Case " + (++number) + ": " + x);
		}
	}
}
