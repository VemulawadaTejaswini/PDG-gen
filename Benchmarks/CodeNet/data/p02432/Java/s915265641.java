import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		List<Integer> DQ=new ArrayList<>();
		int q=in.nextInt();
		
		for(int i=0;i<q;i++) {
			int query=Integer.parseInt(in.next());
			
			switch(query) {
			case 0:
				int d=Integer.parseInt(in.next()),x=Integer.parseInt(in.next());
				if(d==0)DQ.add(0, x);
				else DQ.add(x);
				break;
				
			case 1:
				int p=Integer.parseInt(in.next());
				out.println(DQ.get(p));
				break;
				
			case 2:
				int e=Integer.parseInt(in.next());
				if(e==0)DQ.remove(0);
				else DQ.remove(DQ.size()-1);
				break;
			}
		}
		out.flush();
	}

}

