import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.next());
		
		double ans = (double)num * (double)num * (double)num / 27d;
		
		System.out.println(ans);
		
	}
}