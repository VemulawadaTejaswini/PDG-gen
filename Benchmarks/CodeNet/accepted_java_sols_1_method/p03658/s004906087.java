import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int ans = 0;

		for (int i = 0; i < N; i++){
			int l = scan.nextInt();
			list.add(l);
		}
		Collections.sort(list, Collections.reverseOrder());

		for (int i = 0; i < K; i++){
			ans += list.get(i);
		}
		System.out.println(ans);
	}
}