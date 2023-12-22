import java.util.Scanner;

public class Main{
		
	public static void main(String args[]){
		  
	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    int C = sc.nextInt();
	    
	    int B[] = new int[M];
	    int A[][] = new int[N][M];
	    
	    for(int i = 0; i < B.length; i++) {
	    	B[i] = sc.nextInt();
	    }
	    
	    for(int i = 0; i < N; i++) {
	    	for (int j = 0; j < M; j++) {
				A[i] [j] = sc.nextInt();
			}
	    }
	    
	    int cnt = 0;
	    int sum = 0;
	    for(int i = 0; i < N; i++) {
	    	for(int j = 0; j < B.length; j++) {
	    		sum += A[i][j]*B[j];
	    	}
	    	if(sum+C > 0) {
	    		cnt++;
	    	}
	    	sum = 0;
	    }
	    
	    System.out.println(cnt);
	    
	    
	}
	
}