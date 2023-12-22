import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力

	int n = sca.nextInt();
	int[] pi = new int[n];
	for(int i = 0; i < n; i++) {
		pi[i] = sca.nextInt();
	}

	int ans = 0;
	int min = 300000;
	for(int i = 0; i < n; i++) {
		if(min > pi[i]) {
			min = pi[i];
			ans++;
		}
		else {

		}
	}

	System.out.println(ans);

	// 後始末
	sca.close();
	}
}