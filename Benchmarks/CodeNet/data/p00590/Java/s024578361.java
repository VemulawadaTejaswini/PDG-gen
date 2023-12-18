import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	
	static ArrayList<Integer> primeList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		makePrimeList();

		while(sc.hasNext()) {
			int n = sc.nextInt();
			int count = 0;
			for(int i = 0; i < n+1; i++) {
				if(Collections.binarySearch(primeList, i+1) >= 0 && Collections.binarySearch(primeList, n - i) >= 0) count++;
			}
			System.out.println(count);
			
			
			
			
			
		}
	}
	static void makePrimeList() {
		boolean[] isntPrime = new boolean[10001];
		primeList.add(2);
		for(int i = 3; i < 10001; i += 2) {
			if(!isntPrime[i]) {
				primeList.add(i);
				for(int j = i + i; j < 10001; j += i) {
					isntPrime[j] = true;
				}
			}
		}
	}
}