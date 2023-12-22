import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		long a,b;
 
		Scanner sc = new Scanner(System.in);
 
		a = sc.nextLong();
		b = sc.nextLong();
 
		long ans = 2018;
 
		if (b - a >= 2019) {
			ans = 0;
		} else {
 
			for (long i = a; i < b; ++i) {
				for (long j = i+1; j <= b; ++j) {
					ans = Math.min(ans, (i * j) % 2019);
				}
 
			}
  
		}
 
			System.out.println(ans);
 	}
  
}
