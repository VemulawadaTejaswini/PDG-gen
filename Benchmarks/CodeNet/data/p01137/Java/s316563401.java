import java.io.*;
import java.util.*;

public class Main {
	void print( int warp ) {
		for ( int i = 0; i < 1000000; i++ ){
			for ( int j = 0; j*j < 1000000; j++) {
				for ( int k = 0; k*k*k<100000; k++ ) {
					if ( i + j * j + k * k * k == warp ) {
						System.out.println(i+j+k);
						return;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		while (!sc.hasNext("0")){
			int warp = sc.nextInt();
			m.print(warp);
		}
	}
}