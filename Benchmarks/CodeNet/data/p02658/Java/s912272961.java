import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		int N = a.nextInt();
		long sum = 1;
		long B = 0;
		
		for(int i = 0; i < N; i++) {
			B = a.nextLong();
			sum *= B;
		}
		if(sum <= (long)(10 ^ 18)) {
			System.out.println(sum);
		}else {
			System.out.println("-1");
		}

		
		
	}
}
