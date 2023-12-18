import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();
		
		long dis = Math.abs(a - b);
		
		String ans = (dis % (v - w) == 0) && (t >= dis / (v - w)) ? "YES" : "NO";
		System.out.println(ans);
		
		sc.close();
	}
	
}


