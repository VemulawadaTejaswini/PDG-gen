import java.util.Arrays;
import java.util.Scanner;
import java.util.function.LongSupplier;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static final long[] fal_rnd(long[] ar,LongSupplier sp){
		int l=-1,r=ar.length;
		while(l+1!=r)
			ar[Math.random()<0.5?++l:--r]=sp.getAsLong();
		return ar;
	}
	static final IntStream REPS(int v){return IntStream.range(0, v);};
	public static void main(String[] __){
		while (true) {
			final int n=s.nextInt(),m=s.nextInt(),p=s.nextInt();
			if(n+m+p==0) return;

			final int
			in[]=REPS(n).map(i->s.nextInt()).toArray(),
			sum=Arrays.stream(in).parallel().sum();
			System.out.println(in[m-1]==0?0:
				(int)(sum*(100.0-p)/in[m-1]));
		}
	}
}