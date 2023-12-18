import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next();
		System.out.println(IntStream.range(0,a.length()).filter(i->a.charAt(i)==b.charAt(i)).count());
	}
}
