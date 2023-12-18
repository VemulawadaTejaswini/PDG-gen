import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
	Scanner S=new Scanner(System.in);
	int i,n,m,t=0;
	Queue<String>P=new LinkedList<String>();
	Queue<Integer>T=new LinkedList<Integer>();
	n=S.nextInt();
	m=S.nextInt();
	for(i=0;i<n;i++){
	    P.add(S.next());
	    T.add(S.nextInt());
	}
	while(0<P.size()){
	    if(0<(T.peek()-m)){
		P.add(P.poll());
		T.add(T.poll()-m);
		t=t+m;
	    }
	    else{
		t=t+T.poll();
		System.out.println(P.poll()+" "+t);
	    }
	}
    }
}
	
			      

