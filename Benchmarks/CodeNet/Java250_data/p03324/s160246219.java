import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt(), n = sc.nextInt();
		sc.close();
		long ans = 1;
		for(int i = 0; i < d; ++i)
			ans *= (long)100;
		if(n == 100)n++;
		ans *= (long)n;
		System.out.println(ans);
	}

}
