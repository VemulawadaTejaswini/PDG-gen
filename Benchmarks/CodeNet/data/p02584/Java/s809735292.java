import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = Math.abs(sc.nextLong());
		long K = sc.nextLong();
		long D = sc.nextLong();
		long ans = X;
		if(K * D <= X)
			ans = X - K * D;
		else {
			K -= X / D;
			X = X % D;
			if(K % 2 == 1)
				ans = Math.abs(X - D);
			else
				ans = X;
		}
		System.out.println(ans);
	}

}
