import java.util.*;

public class Main{

	public static void main(String[] args) throws 

java.io.IOException {
		int x,h,m,s;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		h = x / 3600;
		x = x % 3600;
		m = x / 60;
		s = x % 60;
		System.out.println(h + ":" + m + ":" + s);
	}
}