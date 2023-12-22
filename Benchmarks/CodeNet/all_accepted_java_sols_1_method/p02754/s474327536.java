import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	long n = sca.nextLong();
	long a = sca.nextLong();  // blue
	long b = sca.nextLong();  // red
	long blue_times = n / (a+b);
	long blue_amari = n % (a+b);
	long ans = a * blue_times;


	if(blue_amari > a) {
		ans += a;
	}
	else {
		ans += blue_amari;
	}

	System.out.println(ans);


	// 後始末
	sca.close();
	}
}