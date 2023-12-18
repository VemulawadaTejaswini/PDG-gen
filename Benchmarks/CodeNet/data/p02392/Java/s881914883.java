import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int a = Integer.parseInt(s.next()),
		    b = Integer.parseInt(s.next()),
		    c = Integer.parseInt(s.next());
		if(a<b&&b<c)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}