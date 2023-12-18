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
	public static void main(String[] __) throws Exception{
		int n,m;
		solve:
		while((n=s.nextInt())+(m=s.nextInt())!=0){
			List<Integer>
			t=REPS(n).mapToObj(i->s.nextInt()).collect(Collectors.toList()),
			h=REPS(m).mapToObj(i->s.nextInt()).collect(Collectors.toList());
			int
			sumt=t.parallelStream().mapToInt(v->v).sum(),
			sumh=h.parallelStream().mapToInt(v->v).sum();
			if((sumt+sumh)%2==1) {
				System.out.println(-1);
				continue solve;
			}
			for(int i:t) {
				if(h.contains(i+(sumh-sumt)/2)) {
					System.out.printf("%d %d\n",i,i+(sumh-sumt)/2);
					continue solve;
				}
			}
			System.out.println(-1);
		}
	}
}