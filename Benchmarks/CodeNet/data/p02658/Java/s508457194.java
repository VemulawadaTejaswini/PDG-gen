import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long[] x = new long[(int) n];
		long total = 0;
		for(int i = 0;i < n;i++) {
			long y = sc.nextLong();
			x[i] += y;
			if(i > 0) {
				total = x[i-1] * x[i];
			}
		}
		if(total > 100000000000000000f) {
			System.out.println(-1);
		}else {
			System.out.println(total);
		}
  }
}