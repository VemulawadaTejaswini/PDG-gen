import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();

		int i = 1;
		do {
			int x = i;
			if ( x % 3 == 0 ){
				out.print(" " + i);
			} else {
				do{
					if(x % 10 == 3){
						out.print(" " + i);
						break;
					}
					x /= 10;
				}while(x != 0);
			}
		}while( ++i <= n );

		out.println();
	}
}