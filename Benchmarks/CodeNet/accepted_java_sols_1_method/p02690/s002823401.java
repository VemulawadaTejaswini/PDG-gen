	import java.util.*;
	import java.util.Map.Entry;
	 
	 
	 class Main {
		 static int mod =  (int) (Math.pow(10,9)+7);
		 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        int X = sc.nextInt();
	        
	        for(long i=0;i<200;i++) {
	        	for(long j=-200;j<200;j++) {
	        		if(i*i*i*i*i-j*j*j*j*j==X) {
	        	        System.out.print(i);
	        	        System.out.print(" ");
	        	        System.out.println(j);	
	        	        return;
	        		}
	        	}
	        }
	        
	        
	    }
	}