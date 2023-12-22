import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n= scan.nextLong();
		scan.close();
		long x = 0,y = 0;
		for (long i = (long) Math.sqrt(n);i > 0;i--){
            if (n % i == 0){
              x = n / i;
              y = i;
              break;
            }
        }
		System.out.println(x+y-2);
	}

}