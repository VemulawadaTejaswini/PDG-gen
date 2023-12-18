import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    		int i, j, k;
    		while(true) {
	    		int count = 0;
	            int n = sc.nextInt();
	            int x = sc.nextInt();
	            
	            if(n == 0 && x == 0) break;
	            for(i = 1; i <= n; i++) {
	            	for(j = 1; j <= n; j++) {
	            		for(k= 1; k <= n; k++) {
	            			if(i + j + k == x && i < j && j < k) count++;
	            		}
	            	}
	            }
	            System.out.println(count);
    		}	
    }
}

