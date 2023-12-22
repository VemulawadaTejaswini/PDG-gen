import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();
	
	public static void main(String[] args) {

		String s = in.next();

		if (s.equals("SUN")) System.out.println(7);
		else if (s.equals("MON")) System.out.println(6);
		else if (s.equals("TUE")) System.out.println(5);
		else if (s.equals("WED")) System.out.println(4);
		else if (s.equals("THU")) System.out.println(3);
		else if (s.equals("FRI")) System.out.println(2);
		else if (s.equals("SAT")) System.out.println(1);

	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}