import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long N = reader.nextLong();
		long M = reader.nextLong();
		long ans = Math.min(N, M/2);
		N -= ans;
		M -= ans*2;
		if (N == 0) {
			ans += M/4;
		}


		System.out.println(ans);
		reader.close();

	}

}



