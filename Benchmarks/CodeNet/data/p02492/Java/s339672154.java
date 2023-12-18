import java.util.Scanner;
public class Main {

	static int which_Operator(String c) {
		if(c.equals("+")) {
			return(0);
		} else if(c.equals("-")) {
			return(1);
		} else if(c.equals("*")) {
			return(2);
		} else if(c.equals("/")) {
			return(3);
		} else {
			return(-1);
		}
	}
	
	static int calculate(int x, int y, String c) {
		int ans;
		switch(which_Operator(c)) {
			case 0:ans = x + y; break;
			case 1:ans = x - y; break;
			case 2:ans = x * y; break;
			case 3:ans = x / y; break;
			default:ans = 0;    break;
		}
		return(ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int x = stdIn.nextInt();
			String c = stdIn.next();
			int y = stdIn.nextInt();
			if(c.equals("?")) break;
			System.out.println(calculate(x, y, c));
		}
	}

}