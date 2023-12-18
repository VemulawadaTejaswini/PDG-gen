

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k, s;
		k = sc.nextInt();
		s = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= Math.min(k,  s); ++i) {
			for(int j = 0; j <= k; ++j) {
				if(s - i - j >= 0 && s - i - j <= k)sum++;
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
