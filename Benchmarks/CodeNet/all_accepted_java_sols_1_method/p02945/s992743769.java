import java.util.*;

class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		
		int x = A + B;
		int y = A - B;
		int z = A * B;
		
		int max = Math.max(x, y);
		max = Math.max(max,z);
		
		System.out.println(max);
	}
}