import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
long l, r;
		l = s.nextInt();
		r = s.nextInt();
		long ans = 2019;
		for (long i = l; i <= r; i++) {
			for (long j = i+1; j <= r; j++) {
				ans = Math.min(ans, (i * j) % 2019);
                if(ans==0)break;
			}
          if(ans==0)break;
		}
		System.out.println(ans);
	}
}