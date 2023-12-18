import java.util.*;
public class Main {



	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);

	        while(true){
	        	int a=scan.nextInt();
	        	int d =scan.nextInt();
	        	int n =scan.nextInt();
	        	if((a|d|n)==0)break;
	        	int count=0;
	        	for(int i=0;;i++){
	        		if(prime(a+i*d))count++;
	        		if(count==n){
	        			System.out.println(a+i*d);
	        			break;
	        		}
	        	}

	        }
	    }
	    public static boolean prime (int n){
	    	if(n==1)return false;
	    	for(int i=2;i<=Math.sqrt(n);i++)
	    		if(n%i==0)return false;
	    	return true;
	    }
	}