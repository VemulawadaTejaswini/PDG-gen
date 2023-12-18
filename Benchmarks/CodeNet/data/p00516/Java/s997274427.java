import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt(),m=getInt();
		TreeMap<Integer,Integer>t=new TreeMap<>();//<cost,no>
		HashMap<Integer,Integer>r=new HashMap<>();//<  no,vote>
		REPS(n).forEach(i->t.put(getInt()-1,i+1));
		INS(m)
		.mapToObj(t::headMap)
		.map(o->o.values().stream()
				.min(Comparator.naturalOrder())
				.get())
		.forEach(i->r.merge(i,1,Integer::sum));
		System.out.println(
				r.entrySet().stream()
				.max(Entry.comparingByValue())
				.get()
				.getKey());
	}
}