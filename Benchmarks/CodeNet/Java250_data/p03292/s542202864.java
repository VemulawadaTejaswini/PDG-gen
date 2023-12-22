import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}

	public void solve(Scanner sc) {
		int a1 = Integer.parseInt(sc.next());
		int a2 = Integer.parseInt(sc.next());
		int a3 = Integer.parseInt(sc.next());
		
		int a12 = a1 - a2;
		if(a12 < 0) a12 *= -1;
		
		int a23 = a2 - a3;
		if(a23 < 0) a23 *= -1;
		
		int a31 = a3 - a1;
		if(a31 < 0) a31 *= -1;
		
		int max = Math.max(a12, a23);
		max = Math.max(max,  a31);
		System.out.println(a12 + a23 + a31 - max);
	}
}