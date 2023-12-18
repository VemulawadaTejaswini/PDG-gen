import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int[]c={0,0};
		s.next().chars().forEach(i->++c[i-'0']);
		System.err.println(Arrays.toString(c));
		System.out.println(Math.min(c[0],c[1])*2);
	}
}
