import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long X = sc.nextLong();
		long Y = sc.nextLong();
		int ans = 1;
		
		while(X<<1 <= Y) {
			X <<= 1;
			ans++;
		}
		
		System.out.println(ans);
				
		sc.close();
	}
}
