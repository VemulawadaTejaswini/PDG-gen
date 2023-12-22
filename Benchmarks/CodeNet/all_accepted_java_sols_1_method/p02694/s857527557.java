import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long bank = 100;
		long count = 0;
		for(long i = bank;i < X;bank += bank / 100,count++) {
			if(bank >= X) {
				System.out.println(count);
				break;
			}
		}
	}
}