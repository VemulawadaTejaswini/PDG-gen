import java.util.*;
public class Main {

public static int [] m ={500,100,50,10,5,1};

	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);

	        while(true){
	        	
	        	int c =1000-scan.nextInt();
	        	if(c==1000)break;
	        		System.out.println(change(c));
	        	}

	        }
	    public static int change (int n){
	    	int sum=0;
	    	for(int i=0;i<6;i++){
	    		sum+=n/m[i];
	    		n%=m[i];
	    		
	    	}
	    	return sum;
	    }
	    
	}