import java.util.List;
import java.util.Scanner;
import java.util.function.LongSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static final long[] fal_rnd(long[] ar,LongSupplier sp){
		int l=-1,r=ar.length;
		while(l+1!=r)
			ar[Math.random()<0.5?++l:--r]=sp.getAsLong();
		return ar;
	}
	static final IntStream REPS(int v){
		return IntStream.range(0,v);
	};
	public static void main(String[] __){
		int n,r;
		while((n=s.nextInt())+(r=s.nextInt())!=0){
			List<Integer> l=IntStream.rangeClosed(1,n).mapToObj(Integer::valueOf).collect(Collectors.toList());
			for(int i=0;i<r;i++) {
				final int p=s.nextInt(),c=s.nextInt();
				l.addAll(l.subList(n-p-c+1,n-p+1));
				l.subList(n-p-c+1,n-p+1).clear();;
			}
			System.out.println(l.get(l.size()-1));
		}
	}
}