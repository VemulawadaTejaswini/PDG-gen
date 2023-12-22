import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int t=0;
		LinkedList<Process> list=new LinkedList<Process>();
		for(int i=0;i<n;i++){
			String ps=sc.next();
			int pt=sc.nextInt();
			Process pr=new Process(ps,pt);
			list.addLast(pr);
		}
		while(list.size()>0){
			if((list.getFirst()).time>q){
				Process x=list.poll();
				t+=q;
				x.time-=q;
				list.add(x);				
			}else{
				Process x=list.poll();
				t+=x.time;
				System.out.println(x.name+" "+t);
			}
		}
	}
}

class Process{
	String name;
	int time;
	Process(String a,int b){
		name=a;
		time=b;
	}
}