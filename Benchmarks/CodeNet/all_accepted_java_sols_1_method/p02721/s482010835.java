import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = sc.nextInt();
        String S = sc.next();
    	int[] maxWorkDaysL = new int[N + 2];
    	int[] maxWorkDaysR = new int[N + 2];
    	for (int i = 0; i <= N + 1; i++) {
    		maxWorkDaysL[i] = 0;
    		maxWorkDaysR[i] = 0;
    	}
    	int prev = - C;
    	int totalWorkDays = 0;
    	for (int i = 1; i <= N; i++) {
    		if (S.charAt(i - 1) == 'o' && i > prev + C) {
    			totalWorkDays += 1;
    			prev = i;
    		}
    		maxWorkDaysL[i] = totalWorkDays;
    	}
    	prev = - C;
    	totalWorkDays = 0;
    	for (int i = 1; i <= N; i++) {
    		if (S.charAt(N - i) == 'o' && i > prev + C) {
    			totalWorkDays += 1;
    			prev = i;
    		}
    		maxWorkDaysR[N + 1 - i] = totalWorkDays;
    	}
    	for (int i = 1; i <= N; i++) {
    		if (maxWorkDaysL[i - 1] + maxWorkDaysR[i + 1] < K) {
    			System.out.println(i);
    		}
    	}
	}
}
