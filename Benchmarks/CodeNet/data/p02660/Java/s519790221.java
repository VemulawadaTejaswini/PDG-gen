import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		if(isPrime(a))
			System.out.println(1);
		else {
			int count = 0;
			long i = 2;
			while(i * i <= a) {
				long curr = i;
				if(a % curr == 0 && isPrime(curr)) {
					while(a % curr == 0) {
						a /= curr;
						curr *= i;
						count++;
					}
				}
				i++;
			}
			System.out.println(count);
		}
	}
	public static boolean isPrime(long n) {
		if(n == 1)
			return false;
		if (n <= 3) 
            return true; 
        if (n % 2 == 0 || n % 3 == 0) 
            return false; 
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
                return false;
        return true;
	}
}