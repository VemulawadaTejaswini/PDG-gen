import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		if(s.equals("AAA") || s.equals("BBB")){
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		in.close();
	}
}
