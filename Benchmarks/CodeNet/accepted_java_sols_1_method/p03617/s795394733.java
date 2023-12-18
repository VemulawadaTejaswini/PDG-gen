import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long Q = sc.nextInt();
		long H = sc.nextInt();
		long S = sc.nextInt();
		long D = sc.nextInt();
		
		long minOne = Math.min(H * 2, Q * 4);
		minOne = Math.min(minOne, S);
		
		long min = Math.min(D, minOne * 2);
		
		long N = sc.nextLong();
		long ans = min * (N / 2) + minOne * (N % 2);
		
		System.out.println(ans);
	}

}