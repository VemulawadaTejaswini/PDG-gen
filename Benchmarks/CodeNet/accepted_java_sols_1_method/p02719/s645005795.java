import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		if(N>K) N = N%K;
		long answer = Math.min(N, K-N);
		System.out.println(answer);
	}

}
