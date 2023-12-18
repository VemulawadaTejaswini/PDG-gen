import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] className = new String[9];
		int[] am = new int[9];
		int[] pm = new int[9];
		for(int i = 0; i < 9; i++) {
			className[i] = stdIn.next();
			am[i] = stdIn.nextInt();
			pm[i] = stdIn.nextInt();
		}
		int[] count = new int[9];
		int[] in = new int[9];
		for(int i = 0; i < 9; i++) {
			count[i] = am[i] + pm[i];
			in[i] = am[i] * 200 + pm[i] * 300;
		}
		
		for(int i = 0; i < 9; i++) {
			System.out.println(className[i] + " " + count[i] + " " + in[i]);
		}
	}

}