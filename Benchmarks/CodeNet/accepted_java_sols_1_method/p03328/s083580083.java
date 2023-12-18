import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		int p = b - a;
		int ans = 0;
		for(int i = 1; i <= p; ++i) 
			ans += i;
		ans -= b;
		System.out.println(ans);
	}

}
