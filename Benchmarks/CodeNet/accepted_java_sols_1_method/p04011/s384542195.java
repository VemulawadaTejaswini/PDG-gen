import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum1;
		int sum2;
		int total;
		if(n>k) {
			sum1 = k*x;
			sum2 = (n-k)*y;
			total = sum1+sum2;
			System.out.println(total);
		} else {
			System.out.println(n*x);
			
		}
		
		
		
				
	 
  	}
}