
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long K = sc.nextLong();
        sc.close();
        
        if(K <= A) {
        	System.out.println(K);
        }else if(K <= A + B) {
        	System.out.println(A);
        }else {
        	System.out.println(A-(K - A - B));
        }

 

        
        }
	}

