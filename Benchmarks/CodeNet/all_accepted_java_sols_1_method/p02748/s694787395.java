import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int a = sca.nextInt();
	int b = sca.nextInt();
	int m = sca.nextInt();
	int[] a_price = new int[a];
	int[] b_price = new int[b];
	int[] xi = new int[m];
	int[] yi = new int[m];
	int[] ci = new int[m];
	int min_a = 1000000;
	int min_b = 1000000;
	int ans = 1000000;

	for(int i = 0; i < a; i++) {
		a_price[i] = sca.nextInt();
		if(a_price[i] < min_a) {
			min_a = a_price[i];
		}
	}
	for(int i = 0; i < b; i++) {
		b_price[i] = sca.nextInt();
		if(b_price[i] < min_b) {
			min_b = b_price[i];
		}
	}
	ans = min_a + min_b;  // 最小値の候補
	for(int i = 0; i < m; i++) {
		xi[i] = sca.nextInt();
		yi[i] = sca.nextInt();
		ci[i] = sca.nextInt();
		if((a_price[xi[i]-1] + b_price[yi[i]-1] - ci[i]) < ans) {
			ans = a_price[xi[i]-1] + b_price[yi[i]-1] - ci[i];
		}
	}
	System.out.println(ans);

	// 後始末
	sca.close();
	}
}