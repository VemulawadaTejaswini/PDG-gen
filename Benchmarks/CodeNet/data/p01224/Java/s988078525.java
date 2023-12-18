import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			if(n == 1) {
				System.out.println("deficient number");
				continue;
			}
			int sum = 1;
			
			for(int i = 2; i * i <= n; i++) {
				if(n % i == 0) {
					sum += i;
					if(i * i != n) {
						sum += n/i;
					}
				}
			}
			if(sum < n) {
				System.out.println("deficient number");
			}
			else if(sum == n) {
				System.out.println("perfect number");
			}
			else {
				System.out.println("abundant number");
			}
			
			
			
			
		}
	}
}