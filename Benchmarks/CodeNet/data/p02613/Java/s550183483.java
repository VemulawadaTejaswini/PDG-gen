//package atcoder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String [] args)  {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String S[] = new String[(int) N];
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		
		for(int i=0;i<N;i++) {
			S[i] = sc.next();
			
		}
		//System.out.println(S[1]);
		
		
		for(int j=0;j<N;j++) {
			if(S[j].equals("AC")) {
				count1 ++;
			}
			if(S[j].equals("WA")) {
				count2 ++;
			}
			if(S[j].equals("TLE")) {
				count3 ++;
			}
			if(S[j].equals("RE")) {
				count4 ++;
			}
		}
		//System.out.println(count1);
		System.out.println("AC x " + count1);
		System.out.println("WA x" + count2);
		System.out.println("TLE x" + count3);
		System.out.println("RE x" + count4);
		
		
	}
}