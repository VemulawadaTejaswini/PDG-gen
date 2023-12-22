import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int ptr = 0;						
		int[] prime = new int[10000000];	
		Scanner stdIn = new Scanner(System.in);
		int st;
		do{
			st = stdIn.nextInt();
		}while(st<2||st>100000);
		int min = 0;
		prime[ptr++] = 2;
		prime[ptr++] = 3;					

		for (int n = 5 ; n <= 1000000; n += 2) {		
			boolean flag = false;
			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				if (n % prime[i] == 0) {	
					flag = true;
					break;						
				}
			}
			if (!flag) {						
				prime[ptr++] = n;
				if(n >= st) {
					min = n;
					break;
				}
			}
		}
		if(st == 2)	min = 2;
		if(st == 3) min = 3;
			System.out.println(min);
	}
}
