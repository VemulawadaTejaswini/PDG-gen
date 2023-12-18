import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long total = 1;
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextLong();
		}
		
		for(int i=0;i<n;i++) {
			total *= a[i];
		}
		if(total>Math.pow(10, 18)) {
			total = -1;
		}
		System.out.println(total);
	}

}
