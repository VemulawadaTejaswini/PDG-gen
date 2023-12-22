
import java.io.*;
import java.util.*;

public class Main {

	public static void solver() {

		int W = cin.nextInt();
		int H = cin.nextInt();
		int x = cin.nextInt();
		int y = cin.nextInt();
		int r = cin.nextInt();
		
		if ( (x-r >= 0) && (x+r <= W) && (y-r >=0) && (y+r <=H) ) {
			cout.println("Yes");
		} else {
			cout.println("No");
		}
		
	}
		
	public static void main(String[] args) throws IOException {

		cin = new Scanner(System.in);
		Main.solver();
	}

	static Scanner     cin;
	static PrintStream cout = System.out;//標準出力
}