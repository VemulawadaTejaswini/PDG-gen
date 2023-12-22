import java.util.*;


 class Main
 { 
	public static void main(String args[])
 	{ 

		Scanner sc =new Scanner(System.in);
		long l = sc.nextInt();
		long r = sc.nextInt();
		
		long res = Integer.MAX_VALUE;
		
		loop: for(long i = l; i <= r; i++){
			for(long j = i+1; j <= r; j++){
				res = Math.min(res, i*j%2019);
				
				if(res == 0) break loop;
			}
		}
		
		System.out.println(res);

 	}
 }