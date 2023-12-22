import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	long h = sca.nextLong();
	int n = sca.nextInt();
	int[] ai = new int[n];
	for(int i = 0; i < n; i++) {
		ai[i] = sca.nextInt();
	}

	int ans_hint = 0;
	for(int i = 0; i < n; i++) {
		ans_hint += ai[i];
	}
	if((long)ans_hint < h) {
		System.out.println("No");
	}
	else {
		System.out.println("Yes");
	}

	// 後始末
	sca.close();
	}
}