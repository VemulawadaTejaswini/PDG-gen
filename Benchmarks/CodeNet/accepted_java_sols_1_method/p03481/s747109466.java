//package reedeka;
import java.util.*;
import java.lang.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long x, y;
		x = sc.nextLong();
		y = sc.nextLong();
		long i;
		int count = 1;
		for(i=x; i<=y; i++) {
			if(x*2 <=y) {
				count++;
				x = x*2;
			}
			else {
				break;
			}
		}
		System.out.println(count);
	}
}
