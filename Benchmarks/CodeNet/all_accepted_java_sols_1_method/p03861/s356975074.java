import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long sum = (b/x + 1);
		if(a!=0)sum -=(a - 1)/x + 1;
		System.out.println(sum);
	}
}