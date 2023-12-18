import java.util.*;
import java.util.Map.*;

class Main{
	static int mod=1000000007;

	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();

		TreeMap<Integer,Integer>m=new TreeMap<>();
		for(int i=0;i<n;++i) {
			int v=s.nextInt();
			Entry<Integer,Integer> l=m.lowerEntry(v);
			if(l!=null) {
				if(l.getValue()==1)
					m.remove(l.getKey());
				else
					m.merge(l.getKey(),-1,Integer::sum);
			}
			m.merge(v,1,Integer::sum);
		}
		System.out.println(m.values().stream().mapToInt(i->i).sum());
	}
}