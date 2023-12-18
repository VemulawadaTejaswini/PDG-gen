import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
		int n = stdIn.nextInt();
		if(n == 0) {
			break;
		}
		for(int i = 0; i < n; i++) {
			int x1 = stdIn.nextInt();
			int y1 = stdIn.nextInt();
			int z1 = stdIn.nextInt();
			int w1 = stdIn.nextInt();
			int x2 = stdIn.nextInt();
			int y2 = stdIn.nextInt();
			int z2 = stdIn.nextInt();
			int w2 = stdIn.nextInt();
			
			int x3 = x1*x2 + y1*y2*-1 + z1*z2*-1 + w1*w2*-1;
			int y3 = x1*y2 + y1*x2 + z1*w2 + w1*z2*-1;
			int z3 = x1*z2 + y1*w2*-1 + z1*x2 + w1*y2;
			int w3 = x1*w2 + y1*z2 + z1*y2*-1 + w1*x2;
			System.out.println(x3 + " " + y3 + " " + z3 + " " + w3);
		}
		}
			
	}
}