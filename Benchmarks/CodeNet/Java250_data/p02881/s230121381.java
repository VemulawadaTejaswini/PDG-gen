import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();
        long  count = N -1;
        double max = Math.ceil(Math.sqrt(N));

        for (long i=1 ; i < max +1 ; i++) {
        	if ( N % i == 0) {
        		if (N / i + i - 2 < count ) {
        			count = N / i + i - 2;
        		}
        	}
        }
        System.out.println(count);

    }
}