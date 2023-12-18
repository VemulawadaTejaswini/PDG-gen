import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long m = -1000000;
        long s = 1000000;
        for( int i = 0; i < n; i++ ){
        	long a = sc.nextLong();
        	if( m < a )
        		m = a;
            if( s > a )
                s = a;
        }
        int sum = 0;
        for (int i = 0; i <= n; i++ ){
            sum += i;
            
        }
        System.out.println( s+" "+m+" "+sum );

        sc.close();
    }
} 

