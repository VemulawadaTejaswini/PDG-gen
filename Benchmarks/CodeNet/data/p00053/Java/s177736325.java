import java.util.*;
public class Main {

	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	       
	        while(true){
	        	
	        	int n=scan.nextInt();
	        	if(n==0)break;
	        	int count=0;
	        	int sum=0;
	        	for(int i=2;;i++){
	        		if(prime(i)){
	        			count++;
	        			sum+=i;
	        			if(count==n)break;
	        		}
	        	}
	        	System.out.println(sum);
	        }
	    }
	     public static boolean prime (int n){
	            if(n==1)return false;
	            for(int i=2;i<=Math.sqrt(n);i++)
	                if(n%i==0)return false;
	            return true;
	        }
}
	    