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
		int d=0;
		for(int i=s.nextInt();i>0;i--) {
			switch(s.next()){
			case "A":
				d++;
				break;
			case "Un":
				d--;
				if(d<0) {
					System.out.println("NO");
					return;
				}
				break;
			}
		}
		System.out.println(d==0?"YES":"NO");
	}
}