import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
		sc.close();
		for(int i = 0; i < k && i <= b - a; ++i)
			System.out.println(i + a);
		int s = k - 1;
		if(a + k >= b - k + 2)s = b - a - k;
		if(k > b - a + 1)s = -1;
		for(int i = s; i >= 0; --i)
			System.out.println(b - i);
	}

}
