import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		final String d = ":";
		int	i = Integer.parseInt(s.next());

		System.out.print  (i/3600);
		i%=3600;
		System.out.print  (d+i/60);
		i%=60;
		System.out.println(d+i);
	}
}