import java.util.Scanner;

class Main
{
    public static void main( String[] args ) {
    	Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long j = 0;
        for (long i = 1;i <= Math.floor(Math.sqrt(n));i ++) {
        	if (n % i == 0) {
        		j = i;
        	}
        	
        }
        System.out.println(j + (n/j) - 2);
          
    }
}