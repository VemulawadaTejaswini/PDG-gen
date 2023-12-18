import java.util.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int sec = scan.nextInt();
		int h, m, s;
		h = sec / 3600;
		sec %= 3600;
		m = sec / 60;
		sec %= 60;
		s = sec;
		
		System.out.println(h + ":" + m + ":" + s);
	}
}