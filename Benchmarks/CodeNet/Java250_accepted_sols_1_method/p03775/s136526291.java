import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long N = Long.parseLong(sc.next());
		sc.close();

		int answer = Integer.MAX_VALUE;
		for(int i = 1; i <=  Math.sqrt((double)N); i++) {
			if(N % i == 0) {
				long A = i;
				long B = N / i;
				int tmp = Math.max(String.valueOf(A).length(), String.valueOf(B).length());
				if(tmp < answer) answer = tmp;
			}else {
				continue;
			}
		}
		System.out.println(answer);

	}

}