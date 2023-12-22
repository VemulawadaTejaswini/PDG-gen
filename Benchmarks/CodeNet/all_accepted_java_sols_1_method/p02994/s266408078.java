import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),l=s.nextInt();
		int[]a=IntStream.range(l,l+n).toArray();
		//System.err.println(Arrays.toString(a));

		int sum=Arrays.stream(a).sum();
		int min=Arrays.stream(a).boxed().min(Comparator.comparingInt(Math::abs)).get();
		System.err.println(sum);
		System.err.println(min);
		System.out.println(sum-min);
	}
}
