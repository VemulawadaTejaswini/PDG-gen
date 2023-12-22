import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	int k = sca.nextInt();
	int ans = 1;
	while(n/k != 0) {
		n = n / k;
		ans++;
	}

	System.out.println(ans);

	// 後始末
	sca.close();
	}
}