import java.util.Scanner;
public class Main {

	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int[] tabemono = new int[M]; 
    	for(int i = 0; i<N; i++) {
    		int K_i = sc.nextInt();
    		for(int p = 0; p<K_i; p++) {
    			int c = sc.nextInt();
    			tabemono[c-1]++;
    		}
    	}
    	int counter=0;
    	for(int r = 0; r<M; r++) {
    		if(tabemono[r]>=N)counter++;
    	}
    	
    	System.out.println(counter);
    	
    	
    	
    	
  }
  
 
    
        
}
