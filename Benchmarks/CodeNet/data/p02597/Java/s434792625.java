

import java.util.*;
import java.io.PrintWriter;
public class Main {
	
	static PrintWriter out;
	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		out=new PrintWriter(System.out);
		
		int n=sc.nextInt();
		char a[]=sc.next().toCharArray();
		TreeSet<Integer> w=new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2, o1);
			}
			
		});
		ArrayList<Integer> r=new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(a[i]=='W')w.add(i);
			else r.add(i);
		}
		int ans=r.size();
		int k=ans;
		for(int i=0;i<k;i++) {
			if(a[i]=='R')ans--;
		}
		
		out.println(ans);
		
		sc.close();
		out.close();
		
	}
}
