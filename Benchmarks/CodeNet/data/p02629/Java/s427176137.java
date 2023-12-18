import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			
			long N = scan.nextLong();
			
			int count = 1;
			long left = 1;
			long right = 26;
			
			while(true) {
				if(left<=N&&N<=right) {
					//System.out.println(count);
					//System.out.println(left+" "+right+" "+count);

					break;
				}
				count++;
				left = right+1;
				right = right+powo(26,count);
				//System.out.println(left+" "+right+" "+count);
			}
			
			
			StringBuffer sb = new StringBuffer();
			
			count--;
			while(count>=0){
				
				long m = powo(26,count);
				
				if(count==0) {
					//long ans = N/m;
					//System.out.println(ans);
					long bans = N;
					//System.out.println(bans);
					//char d = (char)('`'+ans);
					//System.out.println(d);
					//sb.append(d);
					
					char s = (char)('`'+bans);
					//System.out.println(s);
					sb.append(s);
					count--;
					
				}else{
					long ans = N/m;
					//System.out.println(ans);
					char d = (char)('`'+ans);
					//System.out.println(d);
					sb.append(d);
					count--;
					N=N%m;
					
					
				}
				
				
				
			}
			
			//System.out.println(powo(26,3));
			
			
			System.out.println(sb.toString());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
		
		
		private static long powo(long N,long p) {
			if(p==0)
				return 1;
			else
				return N*powo(N,p-1);
			
		}
		
		
		
	
		

}
