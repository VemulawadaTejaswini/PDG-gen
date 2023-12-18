import java.util.*;

public class Main {
    public static void main(String[] args) {
		long num = new Scanner(System.in).nextLong();
		calc(num);
	}
	public static void calc (long num) {
		long count = 0;
		int duration_count = 0;
		for (long l = 2; l <= 1000000000000L; l++){
			if(num % l == 0) {
			num = num / l;
			count++;
			}
			if(l % 10000000000L == 0) {
				for(int q = 0; q < 100; q++){
					System.out.println(duration_count + "%完了");
					duration_count++;
				}
			}
		}
		printing(count);
	}
	public static void printing(long count) {
		System.out.println(count);
	}
}