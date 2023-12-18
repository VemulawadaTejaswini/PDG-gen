
import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt(),  q= sc.nextInt();

		Deque<String> P = new ArrayDeque<String>();
		Deque<Integer> T = new ArrayDeque<Integer>();

		for(int i=0; i<n; i++){
			P.add( sc.next() );  
			T.add( sc.nextInt() );
		}

		int total=0;
		while ( !P.isEmpty() ) {
			String p= P.pop();
			int t= T.pop();

			if(q<t) { T.add(t-q); P.add(p); total+= q; }
			else { total+= t;  System.out.println(p +" "+ total); } 
		}
	}	
}