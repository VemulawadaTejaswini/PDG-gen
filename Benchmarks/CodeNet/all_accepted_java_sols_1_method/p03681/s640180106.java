import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(Math.abs(m - n) > 1) {
			System.out.println("0");
		}
		else {
			long permutation = 1;
			if(Math.abs(m - n) == 0) permutation *= 2;
			for(int i = 2; i <= n; i++) permutation = permutation * i % 1000000007;
			for(int i = 2; i <= m; i++) permutation = permutation * i % 1000000007;
			System.out.println(permutation);
		}
	}
}