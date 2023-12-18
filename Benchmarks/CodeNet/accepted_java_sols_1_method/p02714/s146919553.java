
import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        long r = 0 ,g = 0, b = 0;
        sc.close();
        
        for(int i = 0; i < N; i++) {
        	if(S.charAt(i) == 'R') {
        		r++;
        	}
        	if(S.charAt(i) == 'G') {
        		    g++;
        	}
        	if(S.charAt(i) == 'B') {
        		b++;
        	}
        }
        
        long ans = r * g * b;
        for(int i = 0; i < N - 2; i++ ) {
            for(int j = i + 1; j < N-1 ; j ++ ) {
            	int k = 2 * j - i;
            	if(k > N-1) break;
            	if(S.charAt(i) != S.charAt(j) && 
            		S.charAt(j) != S.charAt(k) &&
            		S.charAt(k) != S.charAt(i)){
            			ans --;
            		}
            }
        }
        
       
        
        System.out.println(ans);
        
	}
}

 