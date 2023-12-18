import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static long[] fal_rnd(int size){
		AtomicInteger l=new AtomicInteger(-1),r=new AtomicInteger(size);
		long[] res=new long[size];
		INS(size).unordered().parallel().mapToLong(Long::parseLong).forEach(v->res[ThreadLocalRandom.current().nextBoolean()?l.incrementAndGet():r.decrementAndGet()]=v);
		return res;
	}
	static IntStream REPS(int v){
		return IntStream.range(0,v);
	}
	static Stream<String> INS(long size){
		return StreamSupport.stream(Spliterators.spliterator(s,size,Spliterator.NONNULL&Spliterator.IMMUTABLE),false).limit(size);
	}
	public static void main(String[] __){
		int n;
		while(true){
			n=s.nextInt();
			if(n==0)return;
			final int q=s.nextInt();
			HashMap<Integer,Integer> hm=new HashMap<>(51);
			for(int i=0;i<n;i++) {
				for(int j=s.nextInt();j>0;j--) {
					hm.merge(s.nextInt(),1,Integer::sum);
				}
			}
			System.out.println(
					hm.entrySet().parallelStream()
					.filter(o->o.getValue()>=q)
					.max(Entry
							.<Integer,Integer>comparingByValue()
							.thenComparing(Entry.<Integer,Integer>comparingByKey().reversed()))
					.map(Entry::getKey)
					.orElse(0)
					);
		}
	}
}