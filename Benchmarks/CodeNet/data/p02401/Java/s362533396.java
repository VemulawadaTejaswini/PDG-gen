import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while (true) {
			int a = sc.nextInt(); String s = sc.next(); int b = sc.nextInt();
			if (s.equals("?")) return;
			
			if (s.equals("+")) System.out.println(a+b);
			else if (s.equals("-")) System.out.println(a-b);
			else if (s.equals("*")) System.out.println(a*b);
			else if (s.equals("/")) System.out.println(a/b);
		}
		
	}
}
