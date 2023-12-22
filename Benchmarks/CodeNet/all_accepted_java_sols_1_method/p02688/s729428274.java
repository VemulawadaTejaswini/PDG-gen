import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		HashSet hasCandy = new HashSet();

		for (int j = 0; j < K; j++){
			int d = scan.nextInt();
			for (int i = 0; i < d; i++){
				int A= scan.nextInt();
				hasCandy.add(A);
			}
		}

		System.out.println(N - hasCandy.size());
	}
}