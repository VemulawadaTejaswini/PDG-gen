import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
		int n=s.nextInt(),m=s.nextInt();
		for(int i=0;i<n;++i)
			pq.add(s.nextInt());
		for(int i=0;i<m;++i)
			pq.add(pq.poll()/2);
		System.out.println(pq.stream().mapToLong(i->i).sum());
	}
}
