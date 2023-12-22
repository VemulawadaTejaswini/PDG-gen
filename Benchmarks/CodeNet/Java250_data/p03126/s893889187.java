import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[] food = new int[M+1];
    	for (int i = 0; i < N; i++) {
    		int K = sc.nextInt();
    		for (int j = 0; j < K; j++) {
    			food[sc.nextInt()]++;
    		}
    	}
    	int count = 0;
    	for (int score : food) {
    		if (score == N) {
    			count++;
    		}
    	}
    	System.out.println(count);
    }
}