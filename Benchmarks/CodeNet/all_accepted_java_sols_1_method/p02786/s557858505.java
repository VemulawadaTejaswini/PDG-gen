import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long count = 1;
		while(H > 0) {
			H = H / 2;
			count *= 2;
		}
		System.out.println(count - 1);
	}
}