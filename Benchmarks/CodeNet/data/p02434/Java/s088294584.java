import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		//List<Integer> DQ=new ArrayList<>();
		int n=Integer.parseInt(in.next()),q=Integer.parseInt(in.next());
		MyVector V[]=new MyVector[n];
		for(int i=0;i<n;i++)V[i]=new MyVector();
		
		for(int i=0;i<q;i++) {
			int query=Integer.parseInt(in.next());
			
			switch(query) {
			case 0:
				int t1=Integer.parseInt(in.next()),x=Integer.parseInt(in.next());
				V[t1].pushBack(x);
				break;
				
			case 1:
				int t2=Integer.parseInt(in.next());
				if(V[t2].size==0)out.println();
				else {
					for(int j=0;j<V[t2].size-1;j++)out.print(V[t2].V[j]+" ");
					out.println(V[t2].V[V[t2].size-1]);
				}
				break;
				
			case 2:
				int t3=Integer.parseInt(in.next());
				V[t3].clear();;
				break;
			}
		}
		out.flush();
	}

}

class MyVector{
	int V[];
	int size;
	
	MyVector(){
		V=new int[500000];
		size=0;
	}
	
	void pushBack(int x) {
		V[size]=x;
		size++;
	}
	
	void clear(){
		for(int i=0;i<size;i++)V[i]=0;
		size=0;
	}
}

