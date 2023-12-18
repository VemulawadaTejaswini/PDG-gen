import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	long h = sca.nextLong();
	long times = 1L;
	long ans = 0L;

	while(h != 0) {
		ans += times;
		h = h / 2;
		times *= 2;
	}
	System.out.println(ans);

	// 後始末
	sca.close();
	}
}