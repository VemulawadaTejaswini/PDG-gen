import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int i = 0;
		for (int j = 0; j < M; j++) {
			i = sc.nextInt();
			N -= i;
		}
		sc.close();
		if (N < 0) {
			System.out.println(-1);
		}else {
			System.out.println(N);
		}
	}
}