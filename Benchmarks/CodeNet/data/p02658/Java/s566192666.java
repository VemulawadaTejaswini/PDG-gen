import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long[] x = new long[(int) n];
		long total = 1;
		for(int i = 0;i < n;i++) {
			long y = sc.nextLong();
			x[i] += y;
			total *= x[i];
		}
		if(total > 1000000000000000000l) {
			System.out.println(-1);
		}else {
			System.out.println(total);
		}
  }
}