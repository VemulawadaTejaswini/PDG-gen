import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static ArrayList<Integer> listX = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		makePrimeList(104730);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			
			System.out.println(listX.get(n-1));
		}
	}
	public static void makePrimeList(int n) {
		boolean[] isntPrime = new boolean[n];
		isntPrime[0] = isntPrime[1] = true;
		int sum = 2;
		listX.add(2);
		for(int i = 3; i < n; i+= 2) {
			if(!isntPrime[i]) {
				sum += i;
				listX.add(sum);
				for(int j = i + i; j < n; j+= i) {
					isntPrime[j] = true;
				}
			}
		}
	}

	
	
}