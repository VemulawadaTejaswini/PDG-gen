import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] primeNum = new int[n];
		
		
		
		for(int i = 0; i < n; i++) {
			primeNum[i] = sc.nextInt();
		}
		
		int cnt = 0;
		
		for(int i : primeNum) {
			if(primeDec(i)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	static boolean primeDec(int N) {
		if(N == 2) {
			return true;
		} else if(N % 2 == 0) {
			return false;
		} else if(N < 9) {
			return true;
		} else if(N % 3 == 0) {
			return false;
		} else {
			for(int i = 5; i * i <= N; i+=6) {
				if(N % i== 0) {
					return false;
				} else if(N % (i + 2) == 0) {
					return false;
				}
			}
			
			return true;
		}
	}
}