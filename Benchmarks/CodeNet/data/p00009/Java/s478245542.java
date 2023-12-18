import java.util.Scanner;

class Main{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	while (scan.hasNextInt()){
    		int count = 0;
    		int num = scan.nextInt();
    		for(int i = 2; i <= num; ){
    			if(i < 11){
    				if(isprime(i)){
    					count++;
    				}
    				i++;
    			}else{
    				if(isprime(i)){
    					count++;
    				}
    				i += 2;
    			}
    		}
    		
    		System.out.println(count);
    	}
    }
    
    public static int minfactor(int n){
        if (n % 2 == 0) return 2;
         
        int m = 7;
        while (m*m <= n){
            if (m*m == n){
                return m;
            }
            m += 2;
        }
        for(int i = 3; i <= n; i+=2){
        	if(n % i == 0){
        		return i;
        	}
        }
        return n;
    }
     
    public static boolean isprime(int n){
        if(minfactor(n) == n){
            return true;
        }else{
            return false;
        }
    }
}