import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n;
    	int x;
    	int total = 0;
    	int count = 0;
    	int c = 3 * 2 * 1; //3?????????????????????????????????????????????
    	int end = 0;
    	
    	for(;;){
    		n = scan.nextInt();
    		x = scan.nextInt();
    		
    		if(n == end && x == end){
    			break;
    		}
    		
    		for(int i = 1; i <= n; i++){
    			for(int j = 1; j <= n; j++){
    				for(int k = 1; k <= n; k++){
    					if(i != j && j != k && k != i){
	    					total = i + j + k;
	    	    			if(x == total) count++;
    					}
    	    		}
        		}
    		}
    		System.out.println(count / c);
    		count = 0;
    	}
    }
}