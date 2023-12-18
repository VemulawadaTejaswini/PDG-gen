import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum1 = 0;
		long count1 = 0;
		long sum2 = 0;
		long count2 = 0;
		for (int i = 0; i < n; i++) {
		    int a = sc.nextInt();
		    sum1 += a;
		    sum2 += a;
		    if (i % 2 == 0) {
		        if (sum1 <= 0) {
		            count1 += 1 - sum1;
		            sum1 = 1;
		        }
		        if (sum2 >= 0) {
		            count2 += sum2 + 1;
		            sum2 = -1;
		        }
		    } else {
		        if (sum2 <= 0) {
		            count2 += 1 - sum2;
		            sum2 = 1;
		        }
		        if (sum1 >= 0) {
		            count1 += sum1 + 1;
		            sum1 = -1;
		        }
		    }
		}
		System.out.println(Math.min(count1, count2));
	}
}
