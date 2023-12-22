import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
      
		int s0 = Integer.parseInt(s.substring(0, 1));
		int s1 = Integer.parseInt(s.substring(1, 2));
		int s2 = Integer.parseInt(s.substring(2, 3));

		int s_t = s0 + s1 + s2;
		System.out.print(s_t);

	}
}