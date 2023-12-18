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
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int y=s.nextInt(),m=s.nextInt(),d=s.nextInt(),res=1;
			while (y!=1000) {
				res+=m%2==1||y%3==0?20-d:19-d;
				d=0;
				m++;
				if(m==11) {
					y++;
					m=1;
				}
			}
			System.out.println(res);
		}
	}
}