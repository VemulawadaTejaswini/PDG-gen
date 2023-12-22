import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long M = sc.nextLong();
        
        long ans = 0;
        
        if (N > M / 2) {
        	ans += M / 2;
        	M = M % 2;
        } else if (N <= M / 2) {
        	ans += N;
        	M -= N*2;
        	N = 0;
        }
        
        ans += M / 4;

        
        System.out.println(ans);
        
        
    } 
        
}	