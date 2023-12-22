import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<Integer, Integer> S = new HashMap<Integer, Integer>(n);
		for(int i=0; i<n; i++) {
			S.put(in.nextInt(), 0);
		}
		int q = in.nextInt();
		int count = 0;
		for(int i = 0; i < q; i++) {
			if(S.get(in.nextInt()) != null) count++;

		}
		System.out.println(count);

	}

}