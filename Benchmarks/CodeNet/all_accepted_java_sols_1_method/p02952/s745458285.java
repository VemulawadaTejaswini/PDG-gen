
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String N = scan.next();


	        //23456
	        //123456
	        long sum = 0L;
	        if(N.length() ==1) {
	        	System.out.println(N);
	        	return;
	        }
	        if(N.length()%2 ==1) {
	        	//sum += Integer.parseInt( N.substring(1, N.length()))+1;
	        	sum += Long.parseLong( N.substring(1, N.length()))+1  + (Long.parseLong( N.substring(0, 1))-1)* (long)Math.pow(10, N.length()-1);
	        }

	        long n = Long.parseLong(N)/10;

	        while(n>0) {
	        	int digit = String.valueOf(n).length();
	        	if(digit % 2 ==1) {
	        		sum+= (long)(Math.pow(10, digit) - Math.pow(10, digit-1) );
	        	}
	        	n /=10;

	        }
	       	System.out.println(sum);

	       	scan.close();
	}
}
