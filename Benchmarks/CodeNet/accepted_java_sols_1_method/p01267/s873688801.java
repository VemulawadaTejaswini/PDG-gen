import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
 
public class Main{
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	while(true){
    		final int N = sc.nextInt();
    		final int A = sc.nextInt();
    		final int B = sc.nextInt();
    		final int C = sc.nextInt();
    		final int X = sc.nextInt();
 
    		if(N == 0 && A == 0 && B == 0 && C == 0 && X == 0){
    			break;
    		}
    		
    		int count = 0;
    		
    		int cur_x = X;
    		
    		for(int i = 0; i < N; i++){
    			final int Y = sc.nextInt();
    			
    			if(count > 10000){
    				continue;
    			}
    			
    			while(Y != cur_x && count <= 10000){
    				cur_x = (A * cur_x + B) % C;
    				count++;
    			}
    			
    			if(count > 10000){
    				continue;
    			}
    			
    			if(i != N - 1){
    				cur_x = (A * cur_x + B) % C;
    				count++;
    			}
    		}
    		
    		if(count > 10000){
    			System.out.println(-1);
    		}else{
    			System.out.println(count);
    		}
    	}
    	
    	
    	
    }
     
}