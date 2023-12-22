
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long K = sc.nextLong();
		double sm = 100;
		long count = 0;
		while(sm < K) {
			sm = Math.floor(sm * 1.01);
			
			count++;
		}
		System.out.println(count);
	}

}
