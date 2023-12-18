import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
//java8
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Map<Integer, Integer> zyousi = new HashMap<>();
		for(int i=0; i<N; i++) {
			zyousi.put(i+1, 0);

			if(i > 0) {
				int n = sc.nextInt();
				int num = zyousi.get(n);
				zyousi.put(n, num+1);
			}
		}


		for(int i=1; i<=N; i++) {
			System.out.println(zyousi.get(i));
		}
	}

}
