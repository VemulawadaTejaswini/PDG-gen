import java.util.Scanner;

public class Main{
	static long mod = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong(), B = sc.nextLong();
		int cnt = 0;
		for(long Ai = A; Ai <= B; Ai *= 2) {
			cnt++;
		}
		System.out.println(cnt);
	}
}
