import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run(){
		long all = sc.nextLong();
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		long[] aida = new long[(int) all+1];
		long now = 0;
		long last;
		long first;
		
		long l = sc.nextLong();
		first = l - now -1;
		now = l;
		
		for(int i = 1; i < n; i++){
			l = sc.nextLong();
			aida[(int)(l - now - 1)]++;
			now = l;
		}
		last = all - now;

		
		for(int i = 0; i < m; i++){
			long x = sc.nextLong();
			long y = sc.nextLong();
			long between = x + y;
			long sum = n;
			
			long sumTemp = 0;
			for(int k = 1; k < between; k++){
				if(k > all + 1) break;
				long a = aida[k];
				sum += k * a;
				sumTemp += a;
			}
			if(n - 1 - sumTemp > 0) sum += (n - 1 - sumTemp) * between;
			
			if((first - x) >= 0) sum += x;
			else sum += first;
			if((last - y) >= 0) sum += y;
			else sum += last;
			
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}