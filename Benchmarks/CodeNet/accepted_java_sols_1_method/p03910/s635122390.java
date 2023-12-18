import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { //Simply store all segment starts and ends 
		//in array list and iterate through all possibilities accordingly
		Scanner input = new Scanner(System.in);
		long N = input.nextLong();
		long sub = 1;
		while (N>0) {
			N-=sub;
			sub++;
		}
		long bad = Math.abs(N);
		for (long i = 1; i < sub; i++) {
			if (i!=bad) System.out.println(i);
		}
	}
}