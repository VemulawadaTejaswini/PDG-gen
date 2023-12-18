    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
     
    		long X = scan.nextLong();
    		long K = scan.nextLong();
    		long D = scan.nextLong();
    		long b = 0;
     
    		X = Math.abs(X);
     
    		if(X / K > D) {
    			System.out.println(X - (D * K));
    		}else {
    			b = X / D;
    			K -= b;
    			X = X % D;
     
    			if(K % 2 == 0) {
    				System.out.println(X);
    			}else {
    				System.out.println(Math.abs(X - D));
    			}
     
    		}
     
    	}
    }