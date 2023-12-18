import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	long[] ai = new long[n];
	for(int i = 0; i < n; i++) {
		ai[i] = sca.nextLong();
	}
	boolean flg = true;
	Arrays.sort(ai);
	for(int i = 0; i < n-1; i++) {
		if(ai[i] == ai[i+1]) {
			System.out.println("NO");
			flg = false;
			break;
		}
	}
	if(flg == true) {
		System.out.println("YES");
	}

	// 後始末
	sca.close();
	}
}