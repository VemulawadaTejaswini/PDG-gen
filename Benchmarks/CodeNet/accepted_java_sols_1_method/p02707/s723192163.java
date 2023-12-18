import java.util.*;

class Main{
	public static void main(String[] $){
		final Scanner s=new Scanner(System.in);
		final int n=s.nextInt();
		var l=new ArrayList<ArrayList<Integer>>(n-1);
		l.add(new ArrayList<>());
		for(int i=1;i<n;++i){
			l.add(new ArrayList<>());
			l.get(s.nextInt()-1).add(i+1);
		}
		l.forEach(o->System.out.println(o.size()));
	}
}
