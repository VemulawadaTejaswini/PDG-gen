import java.util.*;
 
class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long MOD=1000000007L;
		
		int n=sc.nextInt();
		String s[]=new String[n];
		int p[]=new int[n];
		long sum[]= new long[n];
		Map<Long,Integer> map = new HashMap<>();
		for(int i=0;i<n;++i) {
			s[i]=sc.next();
			p[i]=sc.nextInt();
			
			for(int m=10;m>0;--m) {
				if(s[i].length()>=11-m)sum[i]=sum[i]+('z'-s[i].charAt(10-m)+1)*(long)Math.pow(30, m);
				else sum[i]=sum[i]+('z'-'a'+2)*(long)Math.pow(30, m);
			}
			sum[i]+=p[i];
			map.put(sum[i], i);
			
		}
		
		Arrays.sort(sum);
		
		for(int i=n-1;i>=0;--i) {
			System.out.println(map.get(sum[i])+1);
		}
	}
	
}
