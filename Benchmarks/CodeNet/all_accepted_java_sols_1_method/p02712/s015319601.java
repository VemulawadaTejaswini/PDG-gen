import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();

		long i;
		long sum = 0;
		for(i = 1; i <= n;i ++) {
			if(!(i % 3 == 0 || i % 5 == 0)) {
				sum += i;
			}
		}

		System.out.println(sum);
	}
}
