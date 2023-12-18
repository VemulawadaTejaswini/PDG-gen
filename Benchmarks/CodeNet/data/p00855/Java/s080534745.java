import java.util.*;
public class Main {
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		makeList(1000000);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int min = 0;
			int max = 2;
			int ans = 0;
			int c = 1;
			while(true) {
				if(n == min || n == max) {
					ans = 0;
					break;
				}
				if(n > min && n < max) {
					ans = max - min;
					break;
				}
				min = max;
				max = list.get(c++);
			}
			System.out.println(ans);
		}
	}
	
	public static void makeList(int n) {
		boolean[] isPrime = new boolean[n];
		if(n > 2) {
			isPrime[2] = true;
		}
		for(int i = 3; i < n; i += 2) {
			isPrime[i] = true;
		}
		if(n > 2) {
			list.add(2);
		}
		for(int i = 3; i < n; i += 2) {
			if(isPrime[i]) {
				list.add(i);
				for(int j = i + i; j < n; j += i) {
					isPrime[j] = false; 
				}
			}
		}
	}
	
	
}