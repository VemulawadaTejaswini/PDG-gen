import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		s.next();
		System.out.println(s.next().replaceAll("(.)\\1*","$1").length());
	}
}
