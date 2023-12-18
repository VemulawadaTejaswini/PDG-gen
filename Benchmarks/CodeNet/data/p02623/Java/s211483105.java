import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int K=sc.nextInt();
		
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=0;i<N+M;i++) {
			q.add(sc.nextInt());
		}
		
		int count=0;
		int sum=0;
		if(q.peek()<=K) {
			while(sum<=K&&q.size()!=0) {
				sum=sum+q.poll();
				count++;
			}
		}
		
		System.out.println(count);
		
		
		

	}

}
