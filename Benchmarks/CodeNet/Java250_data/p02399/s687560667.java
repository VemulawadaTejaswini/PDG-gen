import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int a=Integer.parseInt(s.next()),
		    b=Integer.parseInt(s.next());
		System.out.printf("%d %d %f",a/b,a%b,1.0*a/b);
	}
}