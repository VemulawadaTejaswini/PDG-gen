import java.awt.Point;
import java.util.Scanner;
import java.util.Set;
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
		int n;
		while((n=s.nextInt())!=0) {
			Set<Point> set=REPS(n).mapToObj(i->new Point(s.nextInt(),s.nextInt())).collect(Collectors.toSet());
			int a=s.nextInt(),x=10,y=10;
			set.remove(new Point(x,y));
			
			for(int i=0;i<a;i++) {
				String m=s.next();
				int v=s.nextInt();
				for(int j=0;j<v;j++) {
					switch(m){
					case "N":
						y++;
						break;
					case "S":
						y--;
						break;
					case "W":
						x--;
						break;
					case "E":
						x++;
						break;
					}
					//System.out.printf("%d %d\n",x,y);
					set.remove(new Point(x,y));
				}
			}
			//System.out.println(set);
			System.out.println(set.isEmpty()?"Yes":"No");
		}
	}
}