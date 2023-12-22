import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for(int i = 0; i < 3; ++i)
			a[i] = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		Arrays.sort(a);
		int tmp = (int)Math.pow(2,  k);
		int ans = a[0] + a[1] + a[2] * tmp;
		System.out.println(ans);
	}

}
