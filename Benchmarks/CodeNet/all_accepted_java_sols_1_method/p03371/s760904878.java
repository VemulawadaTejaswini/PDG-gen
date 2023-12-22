import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for(int i = 0; i < 3; ++i)
			a[i] = sc.nextInt();
		int x = sc.nextInt(), y = sc.nextInt();
		sc.close();
		int ans = 1000000000;
		for(int i = 0; i <= 2 * Math.max(x,  y); i += 2) {
			int tmp = a[0] * (x - (i / 2)) + a[1] * (y - (i / 2)) + a[2] * i;
			if(x < i / 2)tmp += a[0] * ((i / 2) - x);
			if(y < i / 2)tmp += a[1] * ((i / 2) - y);
			ans = Math.min(ans,  tmp);
		}
		System.out.println(ans);
	}

}
