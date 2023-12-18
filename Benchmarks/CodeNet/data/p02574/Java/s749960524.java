

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
			
		}
		
		int SIZE = (int)1e6+10;
		
		boolean[] isPrime = new boolean[SIZE];
		
		isPrime[0] = isPrime[1] = true;
		
		ArrayList<Integer>[] primes = new ArrayList[SIZE];
		for(int i=0; i<SIZE; i++) {
			primes[i] = new ArrayList<>();
		}
		
		for(int i=2; i<SIZE; i++) {
			if (!isPrime[i]) {
				for(int j=2*i; j<SIZE; j+=i) {
					isPrime[j] = true;
					primes[j].add(i);
				}
			} else {
				primes[i].add(i);
			}
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			for(int x: primes[a[i]]) {
				map.put(x, map.getOrDefault(x, 0)+1);
			}
		}
		
		boolean allOnes = true;
		boolean allMore = true;
		boolean allEqualtoN = true;
		
		for(int u: map.keySet()) {
			if (map.get(u)>1) {
				allOnes = false;
			}
			if (map.get(u)==1) {
				allMore = false;
			}
			if (map.get(u)==n) {
				allEqualtoN = false;
			}
		}
		if (allOnes) {
			System.out.println("pairwise coprime");
		} else if (!allEqualtoN) {
			System.out.println("not coprime");
		} else {
			System.out.println("setwise coprime");
		}
	}
	

}
