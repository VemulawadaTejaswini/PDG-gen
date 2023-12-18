package waterMelon;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int x=sc.nextInt();
			int t=sc.nextInt();
			
		    int times = (n + x - 1) / x;
		    int ans=times*t;
			System.out.println(ans);
		
	    } 
		
}
