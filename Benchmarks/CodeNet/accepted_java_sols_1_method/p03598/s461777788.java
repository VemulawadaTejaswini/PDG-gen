import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int[] x = new int[n];
	int ans = 0;
	for(int i = 0; i < n; i++) {
		x[i] = sc.nextInt();
		ans += 2 * (int)Math.min(x[i], k - x[i]);
	}
	System.out.println(ans);
}
}