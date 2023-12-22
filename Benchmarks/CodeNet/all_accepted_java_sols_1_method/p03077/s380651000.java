import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long min = Long.MAX_VALUE;
		for(int i = 0; i < 5; i++) {
			long l = sc.nextLong();
			if(min > l)
				min = l;
		}
		long sum = num / min + 4;
		sum += num % min == 0 ? 0 : 1;
		System.out.println(sum);
		
	}
}