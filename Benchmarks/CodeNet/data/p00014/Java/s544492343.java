import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt(), ans = 0;
		
		for(int i = d; i < 600; i += d) {
			ans += i * i * d;
		}
		
		System.out.println(ans);
	}
}