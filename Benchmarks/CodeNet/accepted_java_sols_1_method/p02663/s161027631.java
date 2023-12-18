import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int H1 = input.nextInt();
		int M1 = input.nextInt();
		int H2 = input.nextInt();
		int M2 = input.nextInt();
		int K = input.nextInt();
		int H = H2-H1;
		int M = M2-M1;
		int mins = H*60+M;
		System.out.println(mins-K);
	}	
}