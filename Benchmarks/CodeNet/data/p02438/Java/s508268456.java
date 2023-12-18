

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<MyList> L  = new ArrayList<>();
		
		int n = sc.nextInt();
		
		int q = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			MyList List = new MyList();
			L.add(List);
		}
		
		
		for(int i=0;i<q;i++) {
			
			int ver = sc.nextInt();
			int t=0,s=0,x=0;
			switch(ver) {
			
			case 0 :
				t = sc.nextInt();
				x = sc.nextInt();
				
				L.get(t).insert(x);
				
				break;
			case 1 :
				t = sc.nextInt();
				
				L.get(t).dump();
				break;
			case 2 :
				s = sc.nextInt();
				t = sc.nextInt();
				
				L.get(t).splice(L.get(s));
				break;
			}
		}
	}

}

class MyNode{
	int x;
	MyNode after;
	MyNode(int x_ , MyNode after_){
		x = x_;
		after = after_;
	}
}

class MyList{
	MyNode start;
	MyNode end;
	int size;
	
	MyList(){
		
		start = new MyNode(0,null);
		end = start;
		size = 0;
	}
	
	void insert(int x) {
		
		MyNode newNode = new MyNode(x,null);
		
		end.after = newNode;
		end = end.after;
		size++;
	}
	
	void dump() {
		
		MyNode cursor = start.after;
		for( int i = 0; i < size; i++ ){
			if( i == 0 )
				System.out.print( cursor.x );
			else
				System.out.print( " " + cursor.x ); 
			cursor = cursor.after;
		}
		System.out.println();
	}
	
	void splice(MyList Ls) {
		
		end.after = Ls.start.after;
		end = Ls.end;
		size += Ls.size;
		
		Ls.end = Ls.start;
		Ls.size = 0;
	}
}
