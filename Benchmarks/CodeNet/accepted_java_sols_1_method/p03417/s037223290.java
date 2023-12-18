import java.util.Scanner;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long N = sc.nextInt();
        final long M = sc.nextInt();
    	
        if (N > 1 && M > 1) {
        	System.out.println((N - 2) * (M - 2));
        } else if (N == 1 && M == 1){
        	System.out.println(1);
        } else {
        	System.out.println(Math.max(N, M) - 2);
        }
        
    }
    
}