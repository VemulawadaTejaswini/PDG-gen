import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; ++i) {
			if(i % 3 == 0) {
				System.out.print(" " + i);
			}
			else {
				boolean ok = false;
				int x = i;
				while(x > 0) {
					if(x % 10 == 3) {
						ok = true;
					}
					x /= 10;
				}
				if(ok) {
					System.out.print(" " + i);
				}
			}
		}
		System.out.println();
	}
}
