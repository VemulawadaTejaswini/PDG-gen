import java.util.*;

class Main{
	public static void main(String[] A){
		Scanner s=new Scanner(System.in);
		System.out.println(s.next().chars().map(o->o=='+'?1:-1).sum());
	}
}
