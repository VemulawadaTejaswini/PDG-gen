import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	int ans = 0;
	if(n % 2 == 0) {
		ans = n / 2;
	}
	else {
		ans = n / 2 + 1;
	}

	System.out.println(ans);
	// 後始末
	sca.close();
	}
}