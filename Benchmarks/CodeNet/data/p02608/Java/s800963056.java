import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn =new Scanner(System.in);
		long n =scn.nextInt();
		 long range=6;
		 long x=1;
		 long y =1;
		 long z =1;
		 long range1 = ran(x,y,z);
		 StringBuilder  sb=new StringBuilder();
		 PriorityQueue<pair> pq = new PriorityQueue<>();
		 pq.add(new pair(x,y,z,range1));
		  int i=1;
		  while(i<=n){
			  pair p = pq.remove();
			  range=p.val;
		//	  System.out.println(range+"a"+p.x+"b"+p.y+"a"+p.z);
			  
			   x=p.x;
			   y=p.y;
			   z=p.z;
			   x++;
			   
			   pq.add(new pair(x,y,z ,ran(x,p.y,z)));
			//   System.out.println(x+"a"+y+"b"+z);
			  // y= p.y;
			   y++;
			   pq.add(new pair(x,y,z ,ran(x,y,z)));
			 //  System.out.println(x+"a"+y+"b"+z);
			// z=p.z;
			 z++;
			   pq.add(new pair(x,y,z ,ran(x,y,z)));
			  // System.out.println(x+"a"+y+"b"+z);
			   if(i>p.val){
					  continue;
				  }
			   
			  while(i<range && i<=n){
				  sb.append("0");
				  sb.append('\n');
				//  System.out.println(i);
				//  System.out.println(i);
				  i++;
			  }
			  
			  // System.out.println(i);
			  if(i>n){
				  break;
			  }
			  if(i==range){
				   HashSet<Long> hs =new HashSet<>();
				   hs.add(p.x);
				   hs.add(p.y);
				   hs.add(p.z);
				   if(hs.size()==1){
					   sb.append('1');
					   sb.append('\n');
				   }else{
					   if(hs.size()==2){
						   sb.append("3");
						   sb.append('\n');
					   }else{
						   sb.append('6');
						   sb.append('\n');
					   }
				   }
			  }
			  i++;
		  }
//		  while(pq.size()>0){
//			  pair p =pq.remove();
//			  System.out.println(p.val);
//		  }
		System.out.println(sb);
	//	System.out.println(sb.length());
	}
	
	public static long ran(long x,long y ,long z){
		return (x*x+y*y+z*z+y*x+z*y+z*x);
	}
	public static class pair implements Comparable<pair>{
		long x;
		long y;
		long z ;
		long val;
		public pair(long x ,long y,long z, long val){
			this.x=x;
			this.y=y;
			this.z=z;
			this.val=val;
		}
		public int compareTo(pair o){
			return (int)(this.val-o.val);
		}
	}

}

