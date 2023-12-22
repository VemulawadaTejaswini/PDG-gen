import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        while(true){
            final int N = sc.nextInt();
             
            if(N == 0){
                break;
            }
             
            
            int sum = 1, left = 1, right = 1;
            int count = 0;
            
            while(right < N){
            	if(sum < N){
            		right++;
            		sum += right;
            	}else if(sum > N){
            		sum -= left;
            		left++;
            	}else{
            		count++;
            		
            		right++;
            		sum += right;
            	}
            }
            
            System.out.println(count);
        }   
         
    }
 
}