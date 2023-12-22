import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		int Q = scan.nextInt();
		
		Integer[] score = new Integer[N];
		
        for(int i = 0; i < N; ++i) {
        	score[i] = K - Q;
        }
		
        for(int j = 0; j < Q; ++j) {
        	
        	int ans = scan.nextInt();
        	
        	score[ans - 1] += 1;
        }
		
        for(int i = 0; i < N; ++i) {
        	if(score[i] > 0) {
        		System.out.println("Yes");
        	} else {
        		System.out.println("No");
        	}
        }
		
		scan.close();
	}

}
