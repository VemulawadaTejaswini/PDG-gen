import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> list=new LinkedList<Integer>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String op=sc.next();
			if(op.equals("insert")){
				int x=sc.nextInt();
				list.addFirst(x);
			}else if(op.equals("delete")){
				int x=sc.nextInt();
				int t=list.indexOf(x);
				if(t>=0){
					list.remove(t);
				}
			}else if(op.equals("deleteFirst")){
				list.poll();
			}else if(op.equals("deleteLast")){
				list.pollLast();
			}
		}
		while(!list.isEmpty()){
			if(list.size()==1){
				System.out.println(list.poll());
			}else{
				System.out.print(list.poll()+" ");
			}
		}
	}
}