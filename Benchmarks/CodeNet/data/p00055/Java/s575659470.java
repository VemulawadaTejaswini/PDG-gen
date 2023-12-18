import java.util.*;
public class Main {

	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	        while(scan.hasNext()){
	        	
	        	Double a=scan.nextDouble();
	        	System.out.printf("%.8f\n",ss(a,1));
	        	
	        	
	        }
	    }
	    public static double ss(double a,int c){
	    	if(c==11)return 0;
	    	if(c%2==0){
	    		return a+ss(a/3,c+1);
	    	}
	    	else {
	    		return a+ss(a*2,c+1);
	    	}
	    }
}
	    