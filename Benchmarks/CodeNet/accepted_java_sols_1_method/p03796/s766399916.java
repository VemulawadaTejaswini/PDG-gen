import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		long p = 1;
		for(long i = 1; i <= N; i++) {
			p = (p*i)%((int)Math.pow(10, 9)+7);
		}
		System.out.println(p);
	}
}