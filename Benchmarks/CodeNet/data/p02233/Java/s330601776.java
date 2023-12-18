import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] memo = new int[n+1];		
		System.out.println(fib(n,memo));
		
		sc.close();
	}

	static int fib(int n, int[] memo) {
        if      (n == 0) return 1;
        else if (n == 1) return 1;
        else if (memo[n] != 0) return memo[n];
        else { memo[n] = fib(n - 1, memo) + fib(n - 2, memo); 
            return memo[n];
        }
    }
	
}