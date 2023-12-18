import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			int n=in.nextInt();
			if(n==0)break;
			
			List<Integer> ls=new LinkedList<>();
			for(int i=0;i<n;i++)ls.add(Integer.parseInt(in.next()));
			
			int i=0;
			while(true) {
				//System.out.println(ls);
				if(isTriangle(ls)) {
					System.out.println(i);
					break;
				}
				if(i>10000) {
					System.out.println(-1);
					break;
				}
				
				int s=ls.size();
				ListIterator<Integer> itr=ls.listIterator();
				while(itr.hasNext()) {
					int v=itr.next()-1;
					if(v==0)itr.remove();
					else itr.set(v);
				}
				ls.add(s);
				
				i++;
			}
			//System.out.println(ls);
		}
	}
	
	static boolean isTriangle(List<Integer> ls) {
		int i=0;
		for(;i<ls.size();i++) {
			if(ls.get(i)!=i+1)break;
		}
		
		if(i==ls.size())return true;
		else return false;
	}

}

