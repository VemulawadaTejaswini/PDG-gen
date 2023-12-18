import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		
		
		
			long a = in.nextLong(),b=in.nextLong(),c=in.nextLong(),d=in.nextLong();
			if( ( a* b>=0 && a * c >=0 && a * d>=0)) {
				long max1 = Math.max( a * b, a * c);
				long ans =  Math.max(max1, a * d);
				System.out.println(ans);
			}
			else {
				long min1 = Math.max( a * b, a * c);
				long ans1 =  Math.min(min1, a * d);
				System.out.println(ans1);
			}
		
		
		
		
		
	}

}
