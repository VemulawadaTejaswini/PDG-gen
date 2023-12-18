import java.util.Scanner;

public class ABC177_A {
	 public static void main(String[] args){
	        Scanner scan = new Scanner(System.in);
	        long d = scan.nextLong();
	        long t = scan.nextLong();
	        long s = scan.nextLong();

	        if(d/s<=t) {
	        	System.out.println("Yes");
	        }else {
	        	System.out.println("No");
	        }
	    }
}