import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean primes[] = new boolean[1000001];
		sieveOfEratosthenes(primes, 1000000);
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 1000001; i++) {
			if (primes[i]) {
				list.add(i);
				set.add(i);
			}
		}
		boolean poss = true;
		for (int i = 0; i < n; i++) {
			int temp = arr[i];
			for (int j = 0; j < n && list.get(j) < temp; j++) {
				int div = list.get(j);
				if (temp % div == 0) {
					if (set.contains(div)) {
						set.remove(div);
					}
					else {
						poss = false;
						i = n; break;
					}
					while (temp % div == 0) temp = temp / div;
				}
			}
		}
		int gcd = arr[0];
		for (int i = 1; i < n; i++) {
			gcd = gcd(arr[i], gcd);
		}
		if (poss) {
			System.out.println("pairwise coprime");
		}
		else if (gcd == 1) {
			System.out.println("setwise coprime");
		}
		else {
			System.out.println("not coprime");
		}

	}
	
	 static void sieveOfEratosthenes(boolean prime[], int n) { 
	        for(int i=2;i<n;i++) 
	            prime[i] = true; 
	          
	        for(int p = 2; p*p <=n; p++) 
	        { 
	            // If prime[p] is not changed, then it is a prime 
	            if(prime[p] == true) 
	            { 
	                // Update all multiples of p 
	                for(int i = p*p; i <= n; i += p) 
	                    prime[i] = false; 
	            } 
	        }
	    } 
	
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}

}
