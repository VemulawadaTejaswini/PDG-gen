import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int maxInput = (int) Math.pow(2, 15);
	boolean[] isPrime = new boolean[maxInput];
	for (int i = 2; i < maxInput; i++) {
	  isPrime[i] = true;
	}
	isPrime[0] = false;
	isPrime[1] = false;
	for (int i = 2; i * i < maxInput; i++) {
	  if (isPrime[i]) {
		for (int j = 2 * i; j < maxInput; j += i) {
		  isPrime[j] = false;
		}
	  }
	}

	while (true) {
	  int n = in.nextInt();
	  if (n == 0) return;
	  int cnt = 0;
	  for (int i = 2; i <= n / 2; i++) {
		if (isPrime[i] && isPrime[n - i]) cnt++;
	  }
	  System.out.println(cnt);
	}
  }
}
