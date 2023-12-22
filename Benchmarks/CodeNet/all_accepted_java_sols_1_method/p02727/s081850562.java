import java.util.*;


class Main{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int[] p =new int[a];
		int[] q =new int[b];
		int[] all =new int[x+y+c];
		//LinkedList<Integer> q =new LinkedList();
		//LinkedList<Integer> r =new LinkedList();
		//LinkedList<Integer> all =new LinkedList();
		
		long ans = 0;
		
		for(int i=0;i<a;i++){
			//p.add(sc.nextInt());
			p[i]=sc.nextInt();
		}
		
		for(int i=0;i<b;i++){
			//q.add(sc.nextInt());
			q[i]=sc.nextInt();
		}
		
		for(int i=0;i<c;i++){
			//all.add(sc.nextInt());
			all[i]=sc.nextInt();
		}
		//Collections.sort(p);
		//Collections.sort(q);
		
		Arrays.sort(p);
		Arrays.sort(q);
		//Collections.sort(r);
		
		//ans+=p.pollLast();
		//ans+=q.pollLast();
		
		
		
		for(int i=0;i<x;i++){
			//all.add(p.pollLast());
			all[c+i]=p[a-i-1];
		}
		
		for(int i=0;i<y;i++){
			//all.add(q.pollLast());
			all[c+x+i]=q[b-i-1];
		}
		
		
		Arrays.sort(all);
		
		for(int i=0;i<x+y;i++){
			ans+=all[x+y+c-i-1];
		}
		
		System.out.print(ans);
	}
}
	


