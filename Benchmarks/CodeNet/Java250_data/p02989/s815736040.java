import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);

		int sm = list.get((N/2)-1);
		int bi = list.get(N/2);

		int ans = 0;

		if(sm == bi)ans = 0;
		else ans = bi - sm;

		System.out.println(ans);
	}
}