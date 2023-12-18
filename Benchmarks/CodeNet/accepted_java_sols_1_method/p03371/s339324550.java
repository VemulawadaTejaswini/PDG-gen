import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int N = sc.nextInt();
		int M = sc.nextInt();

		long min = Integer.MAX_VALUE;

		for(int n=0;n<=Math.max(N,M)*2;n+=2){
			
			int a = N - n/2;
			int b = M - n/2;

			if(a<0) a=0;
			if(b<0) b=0;

			int v = A * a + B * b + C * n;
			if(min>v) min = v;
			
 		}

 		System.out.println(min);

	}
}