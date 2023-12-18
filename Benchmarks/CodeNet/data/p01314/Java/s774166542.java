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
		int n;
		while ((n=s.nextInt())!=0) {
			int l=1,r=2,c=0;
			while (l*2+1<=n) {
				final int v=(l+r)*(r-l+1)/2;
				if(v==n) c++;
				if(v>=n) l++;
				if(v<n) r++;
			}
			System.out.println(c);
		}
	}
}