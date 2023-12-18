import java.util.*;
public class Main {



	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);

	        while(true){
	        	int a=scan.nextInt();
	        	int b = scan.nextInt();
	        	if((a|b)==0)break;
	        	int f=0;
	        	int t =0;
	        	int h=0;
	        	int c=b-a;
	        	if(c!=0){
	        		t=c/1000;
	        		c%=1000;
	        		f = c/500;
	        		c%=500;
	        		h=c/100;
	        	}
	        	System.out.println(h+" "+f+" "+t);
	        		
	        	}

	        }
	    
	}