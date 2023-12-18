import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static int before, after, sum;

	public static void main(String[] args) {
		while(true) {
			before = sc.nextInt();
			after = sc.nextInt();
			sum = sc.nextInt();
			if( (before|after|sum) == 0 ) break;

			int max = 0;
			for(int i=1; i<=sum/2; i++) {
				int a = calc(i);
				int b = calc(sum-i);
				max = Math.max(max, a+b);
			}

			System.out.println(max);
		}
	}

	static int calc(int a) {
		int ret = a;
		ret = (int) Math.ceil(ret * 100.0 / (100+before));
		ret = (int) Math.floor(ret / 100.0 * (100+after));
		return ret;
	}

}