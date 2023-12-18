import java.util.Scanner;

public class Main {
	static boolean is_prime(int n) {
	    if (n <= 3) {
	        return n > 1;
	    }
	    if (n % 6 != 1 && n % 6 != 5) {
	        return false;
	    }
	    int sqrt = (int) Math.sqrt(n);
	    for (int i = 5; i <= sqrt; i += 6) {
	        if (n % i == 0 || n % (i + 2) == 0) {
	            return false;
	        }
	    }
	    return true;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int x[] = new int[n];
		while(n-1>=0) {
			x[count] = sc.nextInt();
			count++;
			n--;

		}
		count = 0;
		for(int i=0;i<x.length;i++) {
			if(is_prime(x[i])) {
				count++;
				}
			}
		System.out.println(count);
		sc.close();
		}

	}


