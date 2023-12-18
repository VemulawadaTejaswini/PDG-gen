import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long W = sc.nextInt(), H = sc.nextInt(), x =sc.nextInt(), y=sc.nextInt();
		sc.close();
		
		double ans1 = (double)(W*H)/2;
		
		int ans2 = 0;
		if(2*x==W&&2*y==H) ans2 = 1;
		
		System.out.println(ans1+" "+ans2);
	}
	
}