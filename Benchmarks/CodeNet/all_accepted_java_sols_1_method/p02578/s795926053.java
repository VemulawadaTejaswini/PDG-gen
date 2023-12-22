import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		long max = scan.nextLong();
		long ans = 0;
		for(int i=0;i<N-1;i++){
			long c = scan.nextLong();
			ans+=Math.max(0,max-c);
			max=Math.max(c,max);
		}
		System.out.println(ans);
	}
}