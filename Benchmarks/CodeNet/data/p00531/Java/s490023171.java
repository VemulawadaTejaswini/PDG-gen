import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int
			a=s.nextInt(),
			b=s.nextInt(),
			c=s.nextInt(),
			d=s.nextInt(),
			p=s.nextInt(),
			z=Math.max(0, p-c);
		System.out.println(Math.min(a*p, b+z*d));
	}
}