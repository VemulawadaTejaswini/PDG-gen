import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextLong();
		scanner.close();
		calc(num);
	}
	public static void calc (long num) {
		long count = 0;
		for (long l = 2; l <= 1000000000000L; l++){
			long jijou = l * l;
			if(num % jijou == 0);{
			num = num % jijou;
			count++;
			}
		}
		printing(count);
	}
	public static void printing(long count) {
		System.out.println(count);
	}
}