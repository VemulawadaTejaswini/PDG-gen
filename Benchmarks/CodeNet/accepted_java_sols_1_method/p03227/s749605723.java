import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		StringBuilder b=new StringBuilder(s.next());
		System.out.println(b.length()<3?b:b.reverse());
	}
}
