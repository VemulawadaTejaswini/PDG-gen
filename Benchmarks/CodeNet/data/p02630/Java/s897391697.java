
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args)throws Exception {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine().trim();
		int n=Integer.parseInt(s);

		String[] s1=br.readLine().split(" ");
		int sum=0;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int x=Integer.parseInt(s1[i].trim());
			sum+=x;
			if(hm.containsKey(x)) {
				hm.replace(x, hm.get(x)+1);
			}
			else {
				hm.put(x,1);
			}
			
		}


		String s3=br.readLine().trim();
		int q=Integer.parseInt(s3);
//		System.out.println(hm);
//		System.out.println(get_sum(segment,0,n-1,0,a.length-1,0));
		while(q-->0) {
			
			String[] s4=br.readLine().split(" ");
			int l=Integer.parseInt(s4[0].trim());
			int r=Integer.parseInt(s4[1].trim());
			
			if(hm.containsKey(l)) {
				int sum1=hm.get(l);
				if(hm.containsKey(r)) {
					hm.replace(r,sum1+hm.get(r));
				}
				else {
					hm.put(r,hm.get(l));
				}
				hm.remove(l);
				int diff=Math.abs(l-r);
				if(l>r)
				{
				sum-=(sum1*diff);	
				}
				else {
				sum+=(sum1*diff);	
				}
			}
//			System.out.println(hm);
//				
			System.out.println(sum);
			
			
		}
			
		
		
		
		
		
		
	}
}