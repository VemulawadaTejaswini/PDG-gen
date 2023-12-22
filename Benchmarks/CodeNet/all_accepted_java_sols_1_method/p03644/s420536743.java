import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int ans = 1;
		while (N / 2 > 0) {
			ans*=2;
			N/=2;
		}
		System.out.println(ans);


		reader.close();
	}


}



