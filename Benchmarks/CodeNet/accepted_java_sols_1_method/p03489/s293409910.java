import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		HashMap<Long,Integer> h=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLong();
			if(h.containsKey(arr[i]))
			{
				h.put(arr[i],h.get(arr[i])+1);
			}
			else
				h.put(arr[i],1);
			
		}
		long c=0;
		for(Map.Entry<Long, Integer> i:h.entrySet())
		{
			long k=i.getKey();
			long val=(long)i.getValue();
			if(k==1)
				c+=(Math.abs(k-val));
			else if(k==0)
				c+=val;
			else
			c+=(val%k);
		}
		
		System.out.println(c);
	}

}
