import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int w = Integer.parseInt(s.next()),
		    h = Integer.parseInt(s.next()),
		    x = Integer.parseInt(s.next()),
		    y = Integer.parseInt(s.next()),
		    r = Integer.parseInt(s.next());
		if( x-r>=0 && x+r<=w && y-r>=0 && y+r<=h)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}