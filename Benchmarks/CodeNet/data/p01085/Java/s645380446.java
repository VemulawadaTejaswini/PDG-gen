import java.util.Arrays;
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
	static final long[] fal_rnd(int size){
		AtomicInteger l=new AtomicInteger(-1),r=new AtomicInteger(size);
		long[] res=new long[size];
		INS(size).unordered().parallel().mapToLong(Long::parseLong).forEach(v->res[ThreadLocalRandom.current().nextBoolean()?l.incrementAndGet():r.decrementAndGet()]=v);
		return res;
	}
	static final IntStream REPS(int v){
		return IntStream.range(0,v);
	}
	static final Stream<String> INS(long size){
		return StreamSupport.stream(Spliterators.spliterator(s,size,Spliterator.NONNULL&Spliterator.IMMUTABLE),false).limit(size);
	}
	public static void main(String __[]){
		int n,min,max;
		while (true) {
			n=s.nextInt();
			if(n==0)return;
			min=s.nextInt();
			max=s.nextInt();
			long[] in=fal_rnd(n);
			Arrays.parallelSort(in);

			long v=-114514,r=-114514;
			for(int i=min;i<=max;i++) {
				if(in[n-i]-in[n-i-1]>=v) {
					v=in[n-i]-in[n-i-1];
					r=i;
				}
			}
			System.out.println(r);
		}
	}
}