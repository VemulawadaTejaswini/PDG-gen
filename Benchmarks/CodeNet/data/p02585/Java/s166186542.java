import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			long k = sc.nextLong();
			long[] p = new long[n+1];
			long[] c = new long[n+1];
			long maxc = Long.MIN_VALUE;
			
			for(int i=1;i<n+1;i++) {
				p[i] = sc.nextLong();
			}
			for(int i=1;i<n+1;i++) {
				c[i] = sc.nextLong();
				maxc = Math.max(maxc, c[i]);
			}
			
			long ret = maxc;
			
			
			for(int i=1;i<=n;i++) {
				
				int curpoint = i;
				int count = 0;
				long cyclesumi = 0;
				long cyclemaxsumi = Long.MIN_VALUE;
				long maxsumi = Long.MIN_VALUE;
				//System.out.println(maxsumi);
				boolean flg = true;
				while(flg) {
					
					curpoint = (int)p[curpoint];
					
					cyclesumi += c[curpoint];
					
					cyclemaxsumi = Math.max(cyclemaxsumi, cyclesumi);
					count++;
					
					
					
					if(count==k) {
						flg = false;
					}
					
					if(curpoint==i) {
						flg = false;
					}
				}
				
				if(count==k) {
					maxsumi = cyclemaxsumi;
					
					ret = Math.max(ret, maxsumi);
					continue;
				}
				
				if(cyclesumi<=0) {
					maxsumi = cyclemaxsumi;
				}else {
					maxsumi = cyclesumi*(k/count);
					long nokoriidou = k%count;
					int addcurpoint = i;
					while(nokoriidou>0) {
						addcurpoint = (int)p[addcurpoint];
						maxsumi = Math.max(maxsumi, (maxsumi+c[addcurpoint]));
						nokoriidou--;
					}
					
				}
				ret = Math.max(ret, maxsumi);
				
			}
			
			System.out.println(ret);
			
	    }
				
	}
	
