	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int A= sc.nextInt();
			int B = sc.nextInt();
			int res = 0;
			
			for (int i=1;i<=N;i++) {
				int sum = 0;
				for (int n =i;n>0;n/=10) {
					sum += n%10;
				}
			
				if(A<=sum && sum<=B){
					res = res + i;
					}
			}
			System.out.println(res);
			
			sc.close();
		}
		
	}
