import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static IntStream INS(int n){return REPS(n).map(i->getInt());}
	static int getInt(){return Integer.parseInt(s.next());}
	public static void main(String[]$){
		int n=getInt(),
		a[][]=REPS(n).mapToObj(i->INS(3).toArray()).toArray(int[][]::new),
		r[]=new int[n];
		REPS(3).forEach(o->{
			loop:
			for(int i=0;i<n;i++) {
				int v=a[i][o];
				for(int j=0;j<n;j++) if(j!=i){
					if(a[j][o]==v)
						continue loop;
				}
				r[i]+=v;
			}
		});
		Arrays.stream(r).forEach(System.out::println);
	}
}