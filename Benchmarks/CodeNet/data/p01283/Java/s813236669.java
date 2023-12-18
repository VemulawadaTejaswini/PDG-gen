import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
 
public class Main{
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	while(true){
    		final int N = sc.nextInt();
    		
    		if(N == 0){
    			break;
    		}
    		
    		int[] input = new int[N];
    		for(int i = 0; i < N; i++){
    			input[i] = sc.nextInt();
    		}
    		
    		int[] rnd = new int[N + 1];
    		int[] output = new int[N];
    		
    		int[] alpha = new int[256];
    		
    		double min = Double.MAX_VALUE;
    		int min_S = -1, min_A = -1, min_C = -1;
    		
    		for(int S = 0; S <= 15; S++){
    			for(int A = 0; A <= 15; A++){
    				for(int C = 0; C <= 15; C++){
    					rnd[0] = S;
    					Arrays.fill(alpha, 0);
    					
    					for(int i = 1; i < N; i++){
    						rnd[i] = (A * rnd[i - 1] + C) % 256;
    					}
    					
    					for(int i = 0; i < N; i++){
    						output[i] = (input[i] + rnd[i + 1]) % 256;
    						alpha[output[i]]++;
    					}
    					
    					double score = 0;
    					for(int i = 0; i < 256; i++){
    						if(alpha[i] == 0){
    							continue;
    						}
    						score -= (alpha[i] / (double)(N)) * Math.log(alpha[i] / (double)(N));
    					}
    					
    					
    					
    					if(score < min){
    						min_A = A;
    						min_S = S;
    						min_C = C;
    						min = score;
    						//System.out.println(S + " " + A  + " " + C + " " + score);
    						//System.out.println(Arrays.toString(output));
    					}
    					
    				}
    			}
    		}
    		
    		System.out.println(min_S + " " + min_A + " " + min_C);
    		
    	}
    	
    	
    	
    }
     
}