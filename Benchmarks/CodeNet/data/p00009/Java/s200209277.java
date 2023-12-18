import java.util.*;

class Main {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int[] x = new int[30];
        int t=0,j,count=0;
        
        
        while(scan.hasNextInt()){
      count=0;
			int lim = scan.nextInt();
        	int ptr = 0; //?????????????´???°?????°
        	int[] prime = new int[500000]; //?´???°???????´?????????????
        	
        	if(lim >= 2){
        		prime[ptr++] = 2; 
        		count++;
        	}
        	if(lim >= 3){
				prime[ptr++] = 3; 
				count++;
			}
			
        	for (int n = 5; n <= lim; n += 2) { 
        	    boolean wflag = false; 
        	    for (int i = 1; prime[i] * prime[i] <= n; i++) {
              
            	    if (0 == n % prime[i]) {
                    	wflag = true;
                    	break;
                	}
            	}
            	if (!wflag) { 
                	prime[ptr++] = n; 
                	count++; 
            	}
        	}
        	x[t] = count;
        	t++;
        			}
        	for (int i : x)  
            	System.out.println(i);
    }
}