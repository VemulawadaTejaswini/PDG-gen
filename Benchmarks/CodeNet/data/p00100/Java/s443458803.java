import java.util.*;

public class AOJ0100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,no,k,t;;
		int p[];
		long workers[]=new long[4001];
		Set<Integer> s=new TreeSet<Integer>();
		boolean flag;
		while(true){
			flag=false;
			Arrays.fill(workers, 0);
			n=sc.nextInt();
			if(n==0) break;
			p=new int[n];
			for(i=0;i<n;i++){
				no=sc.nextInt();
				k=sc.nextInt();
				t=sc.nextInt();
				if(s.add(no)){
					p[i]=no;
				}
				workers[no]+=k*t;
			}
			for(i=0;i<n;i++){
				if(1000000<=workers[p[i]]){
					System.out.println(p[i]);
					flag=true;
				}
			}
			if(!flag){
				System.out.println("NA");
			}
		}
	}
}