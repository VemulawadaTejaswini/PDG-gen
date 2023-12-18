import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] MARCH = new long[5];
		
		for(int i = 0; i < N; i++) {
			 String S = sc.next();
			if(S.charAt(0) == 'M') {
				MARCH[0]++;
			} else if(S.charAt(0) == 'A') {
				MARCH[1]++;
			} else if(S.charAt(0) == 'R') {
				MARCH[2]++;
			} else if(S.charAt(0) == 'C') {
				MARCH[3]++;
			} else if(S.charAt(0) == 'H') {
				MARCH[4]++;
			}
		}
		
		long total = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = i + 1; j < 4; j++) {
				for(int k = j + 1; k < 5; k++) {
					total += MARCH[i] * MARCH[j] * MARCH[k];
				}
			}
		}
		
		System.out.println(total);
		
	}
}
