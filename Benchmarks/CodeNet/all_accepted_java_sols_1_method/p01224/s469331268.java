import java.util.Scanner;
 
 
public class Main{
     
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	while(true){
    		final int n = sc.nextInt();
    	
    		if(n == 0){
    			break;
    		}
    		
    		int sum = 0;
    		
    		if(n != 1){
    			sum = 1;
    		}
    		
    		for(int i = 2; i <= Math.sqrt(n); i++){
    			if(n % i == 0){
    				if(i*i != n){
    					sum += i + n / i;
    				}else{
    					sum += i;
    				}
    			}
    		}
    		
    		if(sum > n){
    			System.out.println("abundant number");
    		}else if(sum < n){
    			System.out.println("deficient number");
    		}else{
    			System.out.println("perfect number");
    		}
    		
    	}
    	
    }
     
}