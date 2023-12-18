import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long hp=sc.nextLong();
		long sum = 0;
		long t = 1;
		while(hp>0) {
			hp/=2;
			sum+=t;
			t+=t;
		}
		System.out.print(sum);
	}
}
