import java.util.Scanner;

class Main {

    public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);

	long N = sc.nextLong();
	long n = (long)(Math.sqrt(N));

	long x = 1;
	long y = 1;
	for (long i = n; i > 0; i--) {
	    if (N % i == 0) {
		x = i;
		y = N / i;
		break;
	    }
	}

	System.out.println(x + y - 2);
    }
}