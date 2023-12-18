import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		List<Integer> Pn = new ArrayList<>();
		
		for(int i =0; i<N; i++) {
			Pn.add(sc.nextInt());			
		}
		
		Collections.sort(Pn);
		
		int ans = 0;
		for(int i = 0; i<K; i++) {
			ans += Pn.get(i);
		}
		System.out.println(ans);
		
	}
}
