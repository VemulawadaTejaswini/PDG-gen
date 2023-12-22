import java.util.*;
import java.util.Map.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		HashMap<Integer,Integer> o=new HashMap<>(),e=new HashMap<>();
		o.put(0,0);
		e.put(0,0);

		for(int i=0;i<n;++i)
			(i%2==0?e:o).merge(s.nextInt(),1,Integer::sum);

		Comparator<Entry<Integer,Integer>> c=Entry.comparingByValue();
		Entry<Integer,Integer> O=o.entrySet().stream().max(c).get(),E=e.entrySet().stream().max(c).get();
		o.remove(O.getKey());
		e.remove(E.getKey());
		Entry<Integer,Integer> O2=o.entrySet().stream().max(c).get(),E2=e.entrySet().stream().max(c).get();

		int r=O.getValue()+E.getValue();
		if(O.getKey().equals(E.getKey())){
			r=Math.max(O.getValue()+E2.getValue(),
						E.getValue()+O2.getValue());
		}
		System.out.println(n-r);
	}
}
