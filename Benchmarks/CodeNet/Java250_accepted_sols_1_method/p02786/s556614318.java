import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	long H = sc.nextLong();

	long n = 0;
	do {
	    H = H / 2;
	    n++;
	} while (H > 0);

	long ans = 1;
	long floor = 1;
	for (long i = 1; i < n; i++) {
	    ans += floor * 2;
	    floor *= 2;
	}

	System.out.println(ans);
    }
}