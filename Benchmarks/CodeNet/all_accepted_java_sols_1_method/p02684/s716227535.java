import java.util.*;
import java.io.*;




 
public class Main 
{
	
	public static void main(String[] args) throws IOException 
	{ 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long k=s.nextLong();
		
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			int u=s.nextInt();
			u--;
			ar[i]=u;
		}
		if(k<n) {
			int count=0;
			int next=0;
			while(count<k) {
				int val=ar[next];
				count++;
				next=val;
			}
			System.out.println(next+1);
		}else {
			int pos=0;
			int next=0;
			int noofnode=-1;
			HashMap<Integer,Integer>hm=new HashMap<>();
			hm.put(next, pos);
			while(true ) {
				pos++;
				int val=ar[next];
				if(hm.containsKey(val)) {
					noofnode=hm.get(val);
					break;
				}
				hm.put(val, pos);
				next=val;
			}
//				System.out.println(hm.size());
//				System.out.println(noofnode);
				k-=noofnode;
				int nodeincycle=hm.size()-noofnode;
				k%=nodeincycle;
				if(k==0) 
					k=nodeincycle;
				k++;
				int count=0;
				while(count<k) {
					int val=ar[next];
					count++;
					next=val;
				}
				System.out.println(next+1);
			
			
			
		}
	}

	
}


