//package atcoder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String [] args)  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int s=0;
		
		if(N%1000==0) {
			System.out.println(0);
		}else {
			s=N%1000;
			System.out.println(1000-s);
		}
		
	}
}