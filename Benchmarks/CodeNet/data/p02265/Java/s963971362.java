import java.util.Scanner;
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		String s;
		int x;
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			s=scan.next();
			if(s.equals("insert")){
				x=scan.nextInt();
				ll.addFirst(x);
			}else if(s.equals("delete")){
				x=scan.nextInt();
				ll.removeFirstOccurrence(x);
			}else if(s.equals("deleteFirst")){
				ll.removeFirst();
			}else{
				ll.removeLast();
			}
		}
		boolean b=false;
		while(!ll.isEmpty()){
			if(!b){
				System.out.print(ll.pollFirst());
				b=true;
			}else{
				System.out.print(" "+ll.pollFirst());
			}
		}
		System.out.println();
		scan.close();
	}

}