import java.util.*;
public class Main {
	int a, b;

	boolean ball(int num) {
		int before = a + b;
		if(num > a) a = num;
		else if(num > b) b = num;
		if(a + b == before) return(false);
		return(true);
	}

	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		int limit = stdIn.nextInt();
		for(int r = 0; r < limit; r++) {
			boolean flag = true;
			a = b = Integer.MIN_VALUE;
			for(int c = 0; c < 10; c++) {
				int input = stdIn.nextInt();
				flag = ball(input);
			}
			System.out.println((flag) ? "YES" : "NO");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}