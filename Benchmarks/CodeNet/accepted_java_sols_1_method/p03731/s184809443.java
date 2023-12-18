import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long t=sc.nextLong(),sum=t,buff=sc.nextLong();
		for(int i=1;i<n;i++) {
			long now=sc.nextLong();
			sum+=Math.min(t, now-buff);
			buff=now;
		}
		System.out.println(sum);
	}
}
