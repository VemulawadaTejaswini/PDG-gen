import java.io.*;
import java.util.*;
public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		makePrimeList();
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int sum = 0;
			for(int i = 0; i < n; i++) {
				int p = sc.nextInt();
				int m = sc.nextInt();
				if(m == 0) {
					if(!list.contains(p)) {
						sum -= 1;
					}
					continue;
				}
				else  {
				
				int min = Collections.binarySearch(list, p-m);
				if(min < 0) {
					min += 1;
					min *= -1;
				}
				int max = Collections.binarySearch(list, p+m);
				if(max < 0) {
					max += 1;
					max *= -1;
				}
				//System.out.println(min + " " + max + " " + sum);
				if(max - min - 1 >= 0)
				sum += max - min - 1;
				}
			}
			
			System.out.println(sum);
			
		}
	}
	
	static void makePrimeList() {
		boolean[] isntPrime = new boolean[1000000];
		int i = 2;
		for(; i*i < isntPrime.length; i++) {
			if(!isntPrime[i]) {
				list.add(i);
				for(int j = i + i; j < isntPrime.length; j += i) {
					isntPrime[j] = true;
				}
			}	
		}
		
		for(; i < isntPrime.length; i++) {
			if(!isntPrime[i]) {
				list.add(i);
			}
		}
	}
		
}