import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long N=scan.nextLong();
		long K=scan.nextLong();
		long min=N;
		N=N%K;
		min=N;
		while(min>Math.abs(N-K)){
			N=Math.abs(N-K);
			min=Math.min(min,N);
		}
		System.out.println(min);
	}

}
