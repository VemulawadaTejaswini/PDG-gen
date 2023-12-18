import java.util.*;
import java.util.stream.*;

class Main{
	static long[]l=new long[51];
	static long[]b=new long[51];
	
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),w=s.nextInt()-1;
		int[]a=IntStream.range(0,n).map(i->s.nextInt()).sorted().toArray();
		
		System.out.println(
				IntStream.range(0,n-w).map(i->a[i+w]-a[i])
				.min().getAsInt()
				);
	}
}
