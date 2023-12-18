import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long sum = 1;
		i: for(int i = 0; i < t; i++) {
			sum *= sc.nextLong();
		}
		if(sum > (long)1e18)
			System.out.println(-1);
		else
			System.out.println(sum);
	}
}
