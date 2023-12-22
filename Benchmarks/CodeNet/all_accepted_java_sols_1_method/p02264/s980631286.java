import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		LinkedList<String> name=new LinkedList<String>();
		LinkedList<Integer> time=new LinkedList<Integer>();
		int n=sc.nextInt();
		int q=sc.nextInt();
		int t=0;
		for(int i=0;i<n;i++){
			name.add(sc.next());
			time.add(sc.nextInt());
		}
		while(!name.isEmpty()){
			if(time.peek()<=q){
				System.out.print(name.poll()+" ");
				t=t+time.poll();
				System.out.println(t);
			}else{
				name.add(name.poll());
				time.add(time.poll()-q);
				t=t+q;
			}
		}
	}

}