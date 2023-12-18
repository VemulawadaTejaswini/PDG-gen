import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(true){
    		int num = input.nextInt();
    		if(num == 0)break;
    		System.out.println(prime(num));
    	}
    }
    
    public static long prime(int n){
    	long sum = 0;
    	int index = 0;
    	int num = 1;
    	while(index != n){
    		boolean isprime = true;
    		if(num == 1){
    			num++;
    		}else if(num == 2){
    			sum += 2;
    			index++;
    		}else{
    			if(num % 2 != 0){
    				for(int i = 3 ; i <= Math.sqrt(num) ; i+=2){
    					if(num % i == 0){
    						isprime = false;
    						break;
    					}
    				}
    			}else{
    				isprime = false;
    			}
    		}
    		if(isprime){
    			sum += num;
    			index++;
    		}
    		num++;
    	}
    	return sum;
    }
}