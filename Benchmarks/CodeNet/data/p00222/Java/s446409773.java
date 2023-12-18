import java.util.*;

public class Main {
	public static void main(String[] args){
		Prime p = new Prime();
		int n;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			if(n == 0){
				break;
			}
			System.out.println(p.searchMaxQuadruplet(n));
		}
	}
}

class Prime {
	
	private final int size = 664579;
	private int[] prime;
	
	public Prime(){
		prime = new int[size];
		setPrime();
	}
	
    public void setPrime() {
        int ptr = 0;
        

        prime[ptr++] = 2;
        prime[ptr++] = 3;

        for (int n = 5; n <= 10000000; n += 2) {
            boolean flag = false;
            for (int i=1; prime[i]*prime[i]<=n; i++) {
                if (0 == n%prime[i]) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                prime[ptr++] = n;
            }
        }
    }
    
    private int getIndex(int n){
    	for(int i=0; i<size; i++){
    		if(prime[i] > n){
    			return i-1;
    		}else if(prime[i] == n){
    			return i;
    		}
    	}
    	
    	return size-1;
    }
    
    public int searchMaxQuadruplet(int n){
    	int idx = getIndex(n);
    	
    	while(true){
    		if(prime[idx]-prime[idx-1] == 2){
    			if(prime[idx]-prime[idx-2] == 6){
    				if(prime[idx]-prime[idx-3] == 8){
    	    			return prime[idx];
    	    		}
        		}
    		}
    		idx --;
    	}
    	
    }
}