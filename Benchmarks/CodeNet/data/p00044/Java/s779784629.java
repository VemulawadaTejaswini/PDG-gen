import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		makePrimeList();
		while(stdIn.hasNext()) {
			int n = stdIn.nextInt();
			int min = 0;
			int max = 0;
			for(int i = 0; i < list.size()-1; i++) {
				if(list.get(i) < n && list.get(i+1) >= n) {
					min = list.get(i);
					if(list.get(i+1) != n) {
						max = list.get(i+1);
					}
					else {
						max = list.get(i+2);
					}
				}
			}
			System.out.println(min + " " + max);
		}
	}
	public static void makePrimeList() {
		boolean[] isNotPrime = new boolean[60000];
		isNotPrime[0] = isNotPrime[1] = true;
		for(int i = 2; i < 60000; i++) {
			if(!isNotPrime[i]) {
				list.add(i);
				for(int j = i*2; j < 60000; j+= i) {
					isNotPrime[j] = true;
				}
			}
		}
		
		
	}
}