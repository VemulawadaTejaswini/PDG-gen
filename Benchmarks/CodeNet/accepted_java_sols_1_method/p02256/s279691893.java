import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong(),y=sc.nextLong();
		long res=1;

		long max = Math.max(x, y);
		long min = Math.min(x, y);
		while(true) {
			res = max%min;
			if(res==0) break;
			max = min;
			min = res;
		}
		System.out.println(min);

	}
}

