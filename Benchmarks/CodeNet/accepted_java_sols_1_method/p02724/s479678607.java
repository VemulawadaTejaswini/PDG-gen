
	


import java.util.*;


	public class Main {
	public static void main( String[] args) {			
					
					Scanner in = new Scanner(System.in);
					long a = in.nextLong();
					
					long b = a%500;
					long c = a/500;
					long h = b%5;
					long g = b/5;
					
					System.out.println(c*1000+ g*5);
					
			}}