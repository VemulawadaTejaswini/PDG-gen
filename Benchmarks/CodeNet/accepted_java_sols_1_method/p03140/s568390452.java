import java.util.*;
import java.util.stream.*;

class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		int n=s.nextInt();
		String a=s.next();
		String b=s.next();
		String c=s.next();
		System.out.println(
				IntStream.range(0,n).mapToLong(i->Stream.of(a.charAt(i),b.charAt(i),c.charAt(i)).distinct().count()-1)
				.sum()
				);
	}
}