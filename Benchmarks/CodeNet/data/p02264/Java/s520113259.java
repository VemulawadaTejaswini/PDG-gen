import java.util.*;
class Pair{
	int t;
	String name;
	public Pair(int val,String str){
		t = val;
		name = str; 
	}
}
public class Main {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n,quantum;
		n = sc.nextInt();
		quantum = sc.nextInt();
		Queue<Pair> queue = new LinkedList<Pair>();
		for(int i=0;i<n;i++){
			String name = sc.next();
			int t = sc.nextInt();
			queue.offer(new Pair(t,name));
		}
		int elapse =0;
		while(!queue.isEmpty()){
			Pair p = queue.poll();
			int c= Math.min(p.t, quantum);
			p.t -=c;
			elapse+=c;
			if(p.t>0){
				queue.offer(p);
			}else{
				System.out.println(p.name+" "+elapse);
			}
		}
		
	}
}