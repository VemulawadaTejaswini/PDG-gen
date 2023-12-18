import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long ans = 1;

		for(long k=M/N;k>=1;k--){
				if(M%k==0){
					ans = k;
					break;
				}
			
		}

		System.out.println(ans);

	}
}