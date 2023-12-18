import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		makePrimeList();
		while(true) {
			int a = stdIn.nextInt();
			if(a == 0) break;
			int c2 = 0;
			int c5 = 0;
			for(int i = a; i >= 1; i--) {
				int[] ret = f(i);
				c2 += ret[0];
				c5 += ret[2];
			}
			int count = Math.min(c2, c5);
			
			System.out.println(count);
		}
	}
	public static void makePrimeList() {
		boolean[] isntPrime = new boolean[20001];
		isntPrime[0] = isntPrime[1] = true;
		list.add(2);
		for(int i = 3; i < 20001; i+= 2) {
			if(!isntPrime[i]) {
				list.add(i);
				for(int j = i + i; j < 20001; j+= i) {
					isntPrime[j] = true;
				}
			}
		}
	}
	public static int[] f(int a) {
		int[] ret = new int[list.size()];
		while(a > 1) {
			for(int i = 0; i < list.size(); i++) {
				if(a % list.get(i) == 0) {
					a /= list.get(i);
					ret[i]++;
				}
				
			}
			
		}
		return ret;
	}
	
	
}