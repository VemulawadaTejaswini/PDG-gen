import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		long[] lucas = new long[3];
		lucas[0] = 2;
		lucas[1] = 1;
		for(int i = 2;i <= N;++i) {
			lucas[i%3] = lucas[(i+1)%3] + lucas[(i+2)%3];
		}
		System.out.println(lucas[N%3]);
	}
}
