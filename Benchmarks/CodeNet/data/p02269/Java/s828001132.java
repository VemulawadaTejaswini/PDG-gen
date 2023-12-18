import java.util.Scanner;

class Node2{
	Node2 next;
	String data;
	boolean isEqual(String s){
		return data.equals(s);
	}
}

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		Node2 head,crnt;
		head=crnt=new Node2();
		head.next=null;
		crnt=head.next;
		
		int n=scan.nextInt();
		String command;
		boolean c;
		for(int i=0;i<n;i++){
			command=scan.next();
			if(command.equals("insert")){
				command=scan.next();
				Node2 tmp=new Node2();
				tmp.data=command;
				tmp.next=head.next;
				head.next=tmp;
			}else{
				crnt=head.next;
				command=scan.next();
				c=false;
				while(crnt!=null){
					if(crnt.isEqual(command)){
						System.out.println("yes");
						c=true;
						break;
					}
					crnt=crnt.next;
				}
				if(!c) System.out.println("no");
			}
		}
		
		scan.close();
	}
}